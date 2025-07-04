# Teamcubation Spring Data Exercícios

## Descrição

Este projeto consiste na integração de um banco de dados MySQL já existente (com tabelas criadas previamente via SQL) com um projeto Java utilizando **Spring Boot** e **Spring Data JPA**.

Nele, você encontrará:
- Entidades e repositórios modelados para as tabelas `atletas` e `times`.
- Relacionamento entre as entidades respeitando as foreign keys do banco.
- Serviços e DTOs para manipulação e exibição dos dados.
- Endpoints REST para cadastro e busca de atletas e times.
- Métodos específicos desenvolvidos para consultas inspiradas em exercícios de SQL.

---

## Objetivos do Projeto

- Conectar um projeto Spring Boot a um banco MySQL já existente.
- Refletir as tabelas SQL para entidades Java.
- Implementar repositórios JPA para manipulação de dados.
- Demonstrar a manipulação de entidades, relacionamentos e consultas customizadas.
- (Diferencial) Criar endpoints REST para demonstração prática (POST e GET).

---

## Tecnologias Utilizadas

- Java 21
- Spring Boot
- Spring Data JPA
- MySQL
- Postman (para testes e documentação das rotas)
- Colima, Docker
- Bean Validation


## Entidades e Relacionamentos

- **Time**: representa um time de futebol (`@OneToMany`).
- **Atleta**: representa um jogador, sempre relacionado a um time (`@ManyToOne`).

---

## Endpoints REST

A API expõe endpoints para manipulação das entidades **Time** e **Atleta**, e também operações especiais baseadas nos exercícios de SQL:

- Para saber mais detalhes de cada rota e exemplos de request/response, acesse o arquivo [`ENDPOINTS.md`](./ENDPOINTS.md).
- Caso queira ver a coleção do Postman para testar todas as rotas, acesse a pasta [`postman`](https://github.com/yuricapella/teamcubation-spring-data-exercicios/blob/main/postman/teamcubation-spring-data-exercicios.postman_collection.json).
