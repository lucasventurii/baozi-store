# Baozi Store API

API REST desenvolvida para a disciplina de Desenvolvimento Web Back-End.

## Sobre o projeto

A Baozi Store é uma pequena loja de pão chinês. O projeto consiste no desenvolvimento de uma API REST para realizar o controle básico de clientes, produtos e pedidos.

## Tecnologias utilizadas

* Java
* Spring Boot
* Spring Data JPA
* MySQL
* Postman
* Maven

## Entidades

### Cliente

* id
* nome
* clienteDesde

### Produto

* id
* nome
* preco
* estoque

### Pedido

* id
* clienteId
* produtoId
* quantidade

## Endpoints

### Clientes

* `POST /clientes` — cadastrar cliente
* `GET /clientes` — listar clientes
* `GET /clientes/{id}` — buscar cliente por ID
* `DELETE /clientes/{id}` — excluir cliente

### Produtos

* `POST /produtos` — cadastrar produto
* `GET /produtos` — listar produtos
* `GET /produtos/{id}` — buscar produto por ID
* `DELETE /produtos/{id}` — excluir produto

### Pedidos

* `POST /pedidos` — cadastrar pedido
* `GET /pedidos` — listar pedidos
* `GET /pedidos/{id}` — buscar pedido por ID
* `DELETE /pedidos/{id}` — excluir pedido

## Objetivo

O projeto foi desenvolvido com o objetivo de praticar a criação de uma API REST utilizando Spring Boot, persistência de dados com Spring Data JPA e banco de dados MySQL.
