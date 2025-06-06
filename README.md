# 🧑‍💻 Cadastro de Usuário - API REST com Spring Boot

Este projeto é uma API REST desenvolvida em Java com Spring Boot, que realiza operações básicas de **CRUD** (Create, Read, Update, Delete) para gerenciamento de usuários. Ideal para fins de aprendizado, testes ou como base para projetos mais robustos.

---

## 🔧 Tecnologias Utilizadas

- ✅ Java 17+
- ✅ Spring Boot
- ✅ Spring Data JPA
- ✅ Lombok
- ✅ JPA/Hibernate
- ✅ Banco de Dados (PostgreSQL)
- ✅ Maven

---

## 📁 Estrutura do Projeto

```text
src
└── main
    ├── java
    │   └── com.enzo.cadastro_usuario
    │       ├── controller
    │       │   └── UsuarioController.java
    │       ├── business
    │       │   └── service
    │       │       └── UsuarioService.java
    │       └── infrastructure
    │           ├── entity
    │           │   └── Usuario.java
    │           └── repository
    │               └── UsuarioRepository.java

```
---

## 📌 Funcionalidades

- ✅ Cadastrar novo usuário
- ✅ Buscar usuário por ID
- ✅ Atualizar dados do usuário
- ✅ Deletar usuário por ID

---

## 📮 Endpoints da API

| Método | Endpoint                  | Descrição                   |
|--------|---------------------------|-----------------------------|
| POST   | `/usuario`       | Cria um novo usuário        |
| GET    | `/usuario?id=`   | Busca usuário por ID        |
| PUT    | `/usuario?id=`   | Atualiza os dados do usuário|
| DELETE | `/usuario?id=`   | Remove o usuário do sistema |

---

## 📤 Exemplo de JSON

### Requisição para criação ou atualização de usuário:

```json
{
  "email": "exemplo@email.com",
  "nome": "Enzo Pacheco"
}
