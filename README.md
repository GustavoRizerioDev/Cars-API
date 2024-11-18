# Cars-API
Repositoriodo projeto de estudos, feito com java spring

## Tecnologias Utilizadas

- **Java 21**: Linguagem de programação utilizada.
- **Spring Boot**: Framework para desenvolvimento rápido e simplificado.
- **Maven**: Gerenciador de dependências.
- **MySQL**: Banco de dados relacional utilizado.
- **JUnit**: Framework para testes unitários.
## Configuração no application.properties
```bash
spring.application.name=cars
spring.datasource.url=jdbc:mysql://localhost:3306/carrosdb
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
```
## Criando o banco de dados:
### Acesse o MySQL:
```bash
mysql -u seu_usuario -p
```
### Crie o banco de dados:
```bash
CREATE DATABASE carrosdb;
```
## Como Rodar o Projeto
### Clone o repositório:
```bash
git clone <url-do-repositorio>
cd backend
```
### Execute o Maven Wrapper para instalar dependências:
```bash
./mvnw clean install
```
### Execute o Maven Wrapper para instalar dependências:
```bash
./mvnw spring-boot:run
```


