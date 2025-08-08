# 🦸‍♂️ PowerFail Ranking

Uma aplicação web divertida que exibe os **superpoderes mais inúteis já inventados**, classificados pelo nível de inutilidade de 5 (o pior) a 1 (menos pior).

---

## 🎯 Objetivo

Criar uma página que:

- Carregue superpoderes do banco de dados
- Exiba as informações dinamicamente usando Thymeleaf
- Ordene os poderes por nível de inutilidade (5 a 1)
- Utilize PostgreSQL via Docker
- Rode o backend com Spring Boot

---

## 🚀 Tecnologias Utilizadas

- Java 17
- Spring Boot
  - Spring Web
  - Spring Data JPA
  - Validation
  - Spring Boot DevTools
  - PostgreSQL Driver
  - Flyway Migration
  - Docker Compose Support
- Thymeleaf
- Gradle
- HTML/CSS
- Docker / Docker Compose

---

## 🧱 Estrutura do Projeto

```
powerfail-ranking/
├── src/
│   └── main/
│       ├── java/                  # Código Java (controllers, models, etc.)
│       ├── resources/
│       │   ├── templates/         # index.html com Thymeleaf
│       │   ├── static/images/     # Imagens ilustrativas dos superpoderes
│       │   └── application.properties
├── compose.yaml                   # Docker Compose para PostgreSQL
├── build.gradle                   # Build tool
```

---

## ⚙️ Como Executar Localmente

### Pré-requisitos

- Docker e Docker Compose instalados
- Java 17+
- Gradle instalado ou usar o `gradlew`

### Passo 1: Subir o banco de dados

```bash
docker compose -f compose.yaml up -d
```

> Isso irá criar um container PostgreSQL com as configurações corretas.

### Passo 2: Rodar a aplicação Spring Boot

```bash
./gradlew bootRun
```

Ou, se estiver usando o Gradle instalado:

```bash
gradle bootRun
```

Acesse a aplicação em:

```
http://localhost:8080
```

---

## 🗃️ Banco de Dados

A aplicação espera uma tabela chamada `superpoder` com os seguintes campos:

```sql
CREATE TABLE superpoder (
    id BIGINT PRIMARY KEY,
    nome VARCHAR(255),
    descricao VARCHAR(255),
    nivel_inutilidade INTEGER NOT NULL
);
```

Você pode popular os dados com os superpoderes usando um script SQL ou usar Flyway (`resources/db/migration`).

---

## 🖼️ Interface

A página web lista cada superpoder com:

- Nome
- Descrição
- Nível de inutilidade
- Imagem ilustrativa

Exemplo:

```
🖼 imagem
Falar com pedras
"As pedras não respondem, mas você consegue conversar com elas."
Nível de inutilidade: 4
```

---

## 📦 Docker Compose (`compose.yaml`)

Configura o PostgreSQL com persistência e credenciais para desenvolvimento.

---

## 📌 Futuros Upgrades

- [ ] Adicionar paginação ou scroll infinito
- [ ] Possibilidade de votar no poder mais inútil
- [ ] API REST para expor os dados
- [ ] Testes automatizados

---

## 🧠 Autor

Larissa Muniz
