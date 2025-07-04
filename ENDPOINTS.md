## Endpoints REST

A API expõe endpoints para manipulação das entidades **Time** e **Atleta**, utilizando DTOs para **retornar apenas os campos relevantes** (por exemplo, nome, posição, país). Alguns endpoints são inspirados diretamente em exercícios de SQL.

---

## Times

### `POST /api/time`
Cria um novo time no banco de dados.

**Request JSON:**
```json
{
  "nome": "Brasil",
  "pais": "Brasil"
}
```

**Response JSON:**
```json
{
  "nome": "Brasil",
  "pais": "Brasil"
}
```

---

### `GET /api/time`
Lista todos os times registrados, com suporte a paginação.

**Exemplo:**  
`GET http://localhost:8080/api/time?page=0&size=10&sort=nome,asc`

**Response JSON:**
```json
{
  "content": [
    {
      "nome": "Brasil",
      "pais": "Brasil"
    },
    {
      "nome": "Espanha",
      "pais": "Espanha"
    }
  ],
  "totalElements": 2,
  "totalPages": 1,
  "size": 10,
  "number": 0
}
```

---

## Atletas

### `POST /api/atleta`
Cria um novo atleta, **vinculando a um time existente pelo ID**.

**Request JSON:**
```json
{
  "nome": "Neymar",
  "posicao": "atacante",
  "timeId": 1
}
```

**Response JSON:**
```json
{
  "nome": "Neymar",
  "posicao": "atacante"
}
```

---

### `GET /api/atleta`
Lista todos os atletas registrados, com suporte a paginação.

**Exemplo:**  
`GET http://localhost:8080/api/atleta?page=0&size=10&sort=nome,asc`

**Response JSON:**
```json
{
  "content": [
    {
      "nome": "Neymar",
      "posicao": "atacante"
    },
    {
      "nome": "Xavi",
      "posicao": "goleiro"
    }
    // ...
  ],
  "totalElements": 2,
  "totalPages": 1,
  "size": 10,
  "number": 0
}
```

---

### `GET /api/atleta/{id}`
Obtém um atleta pelo ID.

**Exemplo:**  
`GET http://localhost:8080/api/atleta/1`

**Response JSON:**
```json
{
  "nome": "Neymar",
  "posicao": "atacante"
}
```

---

## Exercícios SQL adaptados à API

### Exercicio 03 SQL: lista de atletas filtrando e ordenando por posição

**Endpoint:**  
`GET /api/atleta/posicao?posicao=atacante&page=0&size=10&sort=nome,asc`

**Exemplo de response:**
```json
{
  "content": [
    {
      "nome": "Neymar",
      "posicao": "atacante"
    },
    {
      "nome": "Cristiano",
      "posicao": "atacante"
    }
  ],
  "totalElements": 2,
  "totalPages": 1,
  "size": 10,
  "number": 0
}
```

---

### Exercicio 05 SQL: lista combinada de nomes de atletas e nomes de times

**Endpoint:**  
`GET /api/atleta/time?page=0&size=10&sort=nomeAtleta,desc`

**Exemplo de response:**
```json
{
  "content": [
    {
      "JOGADOR": "Neymar",
      "TIME": "Brasil"
    },
    {
      "JOGADOR": "Xavi",
      "TIME": "Espanha"
    }
  ],
  "totalElements": 2,
  "totalPages": 1,
  "size": 10,
  "number": 0
}
```

---

- Para exemplos de uso de queries SQL e coleções de testes via Postman, veja a pasta [`/postman`](https://github.com/yuricapella/teamcubation-spring-data-exercicios/tree/main/postman) e o arquivo `exercicios-sql.md`.```
