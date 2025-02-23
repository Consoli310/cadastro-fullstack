# Página de Cadastro

Este é um projeto full stack desenvolvido com **Spring Boot** para o backend e **HTML/CSS** para o frontend. A aplicação implementa uma API RESTful com operações CRUD para o cadastro de clientes, utilizando **Spring Data JPA** com o banco de dados **H2**.

## 🚀 Tecnologias Utilizadas

- **Backend:** Spring Boot, Spring Data JPA, H2 Database
- **Frontend:** HTML, CSS
- **Dependências:** Spring Web, Spring Boot Starter Data JPA, H2 Database

## 📌 Funcionalidades

- Cadastro de clientes com os seguintes campos:
  - Nome
  - Idade
  - E-mail
  - CPF
- Persistência dos dados utilizando banco de dados H2
- API RESTful para operações CRUD (Create, Read, Update, Delete)
- Interface amigável para cadastro de clientes
- Exibição de mensagem de sucesso após o envio do formulário

## 📂 Estrutura do Projeto

```
projeto-cadastro/
│-- src/
│   ├── main/
│   │   ├── java/com/seuprojeto/
│   │   │   ├── controller/       # Controladores REST
│   │   │   ├── model/            # Entidades do banco de dados
│   │   │   ├── repository/       # Interfaces de repositório
│   │   │   ├── service/          # Regras de negócio
│   ├── resources/
│   │   ├── static/               # Arquivos HTML/CSS
│   │   ├── application.properties
│-- pom.xml
```

## ⚙️ Como Executar o Projeto

1. Clone o repositório:
   ```sh
   git clone https://github.com/seuusuario/projeto-cadastro.git
   ```
2. Acesse o diretório do projeto:
   ```sh
   cd projeto-cadastro
   ```
3. Execute o backend com Maven:
   ```sh
   mvn spring-boot:run
   ```
4. Acesse a interface de usuário no navegador:
   ```
   http://localhost:8080
   ```

## 🗄️ Banco de Dados

O projeto utiliza o banco de dados **H2**, um banco em memória para testes e desenvolvimento. Para acessar o console do H2:

- URL: [http://localhost:8080/h2-console](http://localhost:8080/h2-console)
- JDBC URL: `jdbc:h2:mem:testdb`
- Usuário: `sa`
- Senha: (deixe em branco)

