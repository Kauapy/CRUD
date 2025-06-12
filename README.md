# CRUD CLI com JDBC e PostgreSQL

## Descrição

Este projeto é uma aplicação Java que implementa um CRUD (Create, Read, Update, Delete) operante por linha de comando (CLI). Usamos JDBC para conectar a um banco de dados PostgreSQL – por exemplo, hospedado no Aiven – e realizar operações na tabela `usuario`.

## Pré-requisitos

- **Java 17**
- **Apache Maven**
- **PostgreSQL** (utilize as credenciais fornecidas pelo Aiven ou seu ambiente)
- Ferramenta para execução de comandos SQL (pgAdmin, DBeaver ou CLI)

## Estrutura do Projeto


## Configurando o Banco de Dados

1. **Criar a tabela e inserir registros de teste**

   Execute o arquivo `sql/script.sql` no seu banco de dados PostgreSQL. O conteúdo do script é:

   ```sql
   CREATE TABLE usuario (
     id SERIAL PRIMARY KEY,
     nome VARCHAR(100) NOT NULL,
     email VARCHAR(150) NOT NULL UNIQUE
   );

   INSERT INTO usuario (nome, email) VALUES
     ('João Silva', 'joao.silva@example.com'),
     ('Maria Souza', 'maria.souza@example.com');

Compilação e Execução
Via Maven CLI:
- Compilar o Projeto
- Na raiz do projeto (pasta onde se encontra o pom.xml), execute:
**mvn clean compile**
- Executar o Menu Interativo (CLI)
- Utilize o exec-maven-plugin configurado para executar a classe MainCLI:
**mvn exec:java**


- Ao executar, você verá um menu com as seguintes opções:
- 1 – Listar usuários
- 2 – Adicionar um novo usuário
- 3 – Atualizar um usuário existente
- 4 – Deletar um usuário
- 0 – Sair
Alternativamente, via Java Diretamente:- Compile o projeto com Maven:
**mvn clean compile**


- Execute a classe principal:
**java -cp target/classes com.crud.demo.MainCLI**
Operações CRUD- Listar Usuários
O método getAll() em UsuarioDAO.java retorna todos os registros na tabela usuario.
- Adicionar Usuário
A opção de adicionar usuário, através do método create(), insere um novo registro com os dados informados.
- Atualizar Usuário
Através do método update(), você pode alterar o nome e o email de um usuário existente identificando-o pelo ID.
- Deletar Usuário
A opção de deletar utiliza o método delete(), removendo o usuário com base no ID informado.
