package io.github.nathanxxz.produtos_api.controller;

import io.github.nathanxxz.produtos_api.model.Produto;
import io.github.nathanxxz.produtos_api.repository.ProdutoI;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("produtos")
public class ProdutoController {

    private ProdutoI produtoI;

    public ProdutoController(ProdutoI produtoI) {
        this.produtoI = produtoI;
    }

    @PostMapping
    public Produto salvarProduto(@RequestBody Produto produto){
        System.out.printf("Salvando o produto: %s%n",produto);
        var id = UUID.randomUUID().toString();
        produto.setId(id);
        produtoI.save(produto);
        return produto;
    }
    @GetMapping("/{id")
    public Produto buscarPorID(@PathVariable("id") String id){
        Optional<Produto> produto = produtoI.findById(id);
        return produto.isPresent() ? produto.get() :null;
    }

    @DeleteMapping("{id}")
    public void deleteProduto(@PathVariable("id") String id){
        produtoI.deleteById(id);
    }
    @PutMapping("{id}")
    public  void atualizar(@PathVariable("id") String id,@RequestBody Produto produto){
            produtoI.save(produto);
    }
}
