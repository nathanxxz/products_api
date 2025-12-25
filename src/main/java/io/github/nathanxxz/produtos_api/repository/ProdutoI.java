package io.github.nathanxxz.produtos_api.repository;

import io.github.nathanxxz.produtos_api.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoI  extends JpaRepository<Produto,String> {

}
