CREATE TABLE tb_produto(
    codigo VARCHAR(255) NOT NULL PRIMARY KEY ,
    nome VARCHAR(255) NOT NULL ,
    descricao VARCHAR(400) ,
    preco NUMERIC (18, 2)
);