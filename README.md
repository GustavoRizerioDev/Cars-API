# Cars-API
Repositoriodo projeto de estudos, feito com java spring boot e postgres.

## Tecnologias Utilizadas

- **Java 21**: Linguagem de programação utilizada.
- **Spring Boot**: Framework para desenvolvimento rápido e simplificado.
- **Maven**: Gerenciador de dependências.
- **Postgres**: Banco de dados relacional.
- **Docker**: Plataforma para desenvolvimento, envio e execução de aplicações em containers.
- **Docker Compose**: Ferramenta para definir e executar aplicativos Docker multi-container.
- **Flyway**: Controle de versão para banco de dados.
- **Lombok**: Biblioteca Java que ajuda a reduzir a verbosidade do código-fonte.

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

### Build the application

Create the `.env` file and put the environment variable with your values:

```
DB_USERNAME
DB_PASSWORD
```

After setting up your environment, up the docker container:

```sh
docker compose-up
```