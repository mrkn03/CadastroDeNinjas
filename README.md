# Sistema de Cadastro de Ninjas

Bem-vindo ao **Sistema de Cadastro de Ninjas**, um projeto desenvolvido para gerenciar ninjas e suas missões com base nas melhores práticas de desenvolvimento de software e tecnologias modernas.

---

## 📖 Visão Geral
O sistema permite o cadastro de ninjas, a criação de missões e a associação entre essas entidades, utilizando uma arquitetura em camadas com **Spring Boot**. Ferramentas como **Flyway**, **H2** e **Docker** são empregadas para garantir escalabilidade, organização e facilidade de uso.

---

## 🛠️ Funcionalidades Principais

- **Cadastro de Ninjas:**
  - Registro de nome, idade, email e rank.
- **Gerenciamento de Missões:**
  - Criação de missões com título e descrição detalhada.
  - Associação de missões a ninjas (um ninja pode ter uma missão; uma missão pode ter vários ninjas).
- **Relacionamento Entre Entidades:**
  - **Ninja**: Representa os guerreiros cadastrados no sistema.
  - **Missão**: Representa tarefas designadas aos ninjas.

---

## 🚀 Tecnologias Utilizadas

- **Spring Boot**: Framework para criação de aplicações Java.
- **H2 Database**: Banco de dados em memória para desenvolvimento e testes.
- **Flyway**: Gerenciamento de migrações do banco de dados.
- **Spring Data JPA**: Ferramenta para mapeamento objeto-relacional.
- **Docker**: Para criação de builds externos.
- **SQL**: Linguagem para manipulação e consulta de dados.
- **Maven**: Gerenciamento de dependências e builds.
- **Git**: Controle de versão.
- **GitHub**: Hospedagem do código-fonte.

---

## ⚙️ Como Configurar e Executar o Projeto

1. **Clone o repositório:**
   ```bash
   git clone https://github.com/mrkn03/CadastroDeNinjas.git
   ```
2. **Acesse o diretório do projeto:**

  ```bash
  cd CadastroDeNinjas
  ```

3. **Construa o projeto:**

  ```bash
  mvn clean install
  ```

4. **Inicie a aplicação:**

```bash
mvn spring-boot:run
```

5. **Acesse a aplicação no navegador:**

 ```bash
  URL: http://localhost:8080
```
  
## 📊 Design do Banco de Dados
Tabela Ninja:
id (PK): Identificador único do ninja.
nome: Nome do ninja.
idade: Idade do ninja.
email: Email do ninja.
rank: Rank do ninja.
Tabela Missão:
id (PK): Identificador único da missão.
titulo: Título da missão.
descricao: Descrição detalhada da missão.
Relacionamento:
Um ninja pode estar associado a uma única missão.
Uma missão pode ser atribuída a vários ninjas.

## 📂 Repositório no GitHub
O código-fonte do projeto está disponível em:
🔗 GitHub - CadastroDeNinjas

## 📌 Notas Finais
Este projeto é uma excelente oportunidade para aprender:

Desenvolvimento Java com Spring Boot.
Boas práticas de banco de dados.
Uso de ferramentas como Flyway, Docker, e Maven.
