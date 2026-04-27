# 🍖 F.E.E.D — Food Emergency & Equitable Distribution

<div align="center">

![ODS 2](https://img.shields.io/badge/ODS%202-Fome%20Zero-brightgreen?style=for-the-badge&logo=leaflet)
![Java](https://img.shields.io/badge/Java-Swing-orange?style=for-the-badge&logo=openjdk)
![MySQL](https://img.shields.io/badge/MySQL-Database-blue?style=for-the-badge&logo=mysql)
![Status](https://img.shields.io/badge/Status-Em%20Desenvolvimento-yellow?style=for-the-badge)

**Sistema desktop de gestão de doações e distribuição de alimentos para ONGs**

*Projeto A3 — USJT | Alinhado à ODS 2 da ONU: Fome Zero e Agricultura Sustentável*

</div>

---

## 📖 Sobre o Projeto

O **F.E.E.D** (*Food Emergency & Equitable Distribution*) é um sistema desktop desenvolvido em **Java** com interface graáfica desenvolvida utilizando **Java Swing** com manipulação de banco de dados **MySQL**, focado para ajudar no gerenciamento de doações e distribuição de alimentos todos aqueles que precisam, um projeto nascido para as ONGs não terem de se preocupar com o sistema de distribuição, e poderem focar integralmente nas doações.

Por mais que a ideia do projeto nasceu como um trabalho academico, focamos nosso maximo para desenvolver algo que possa sim ser utilizado, sendo totalmente funcional, e compativel com o mundo real, sabemos que existem outras formas de ajudar a causa, portanto se está lendo isso, considere doar para algumas das ONGs que estarão listadas ao final deste **README**.

---

## 🎯 O que o programa faz?

Foco em permitir ONGs: *(mas não se limitando a apenas ONGs)*:

- Cadastrem outras ONGs que serão **beneficiarias**.
- Controlar o **estoque atual de alimentos** recebidos.
- Imprimir um relatorio com todas as doações mensais.
- Exibir graficos que mostram o progresso do projeto
- Registrar **doadores** (Pessoa fisica, Empresas e/ou Outras ONGs)
- Registrar todas as doações recebidas e as distribuições feitas

---

## 🗂️ Telas do Sistema

| # | Tela | Descrição |
|---|------|-----------|
| 1 | 🔐 Login * | Autenticação de usuários com validação no banco de dados |
| 2 | 🏠 Menu Principal | Central de navegação entre todos os módulos |
| 3 | 👨‍👩‍👧 Beneficiários | CRUD de famílias e pessoas atendidas |
| 4 | 🤝 Doadores | CRUD de pessoas físicas e empresas doadoras |
| 5 | 🥦 Alimentos | CRUD do estoque de alimentos com controle de validade |
| 6 | 📦 Doações | Registro de entradas de alimentos por doador |
| 7 | 🚚 Distribuições | Registro de entregas de alimentos aos beneficiários |
| 8 | 👤 Usuários | Gerenciamento de usuários e perfis de acesso (Admin) |
| 9 | 📊 Relatórios | Painel de indicadores e exportação de dados |

---

## 🛠️ Tecnologias Utilizadas

- **Linguagem:** Java (JDK 17+)
- **Interface Gráfica:** Java Swing
- **Banco de Dados:** MySQL 8.0+
- **Conexão:** JDBC (`mysql-connector-java`)
- **IDE Utilizada:** IntelliJ IDEA
- **Padrão de projeto:** MVC (Model-View-Controller)

---

## ⚙️ Pré-requisitos

Antes de rodar o projeto, você precisa ter instalado:

- [JDK 17+](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
- [MySQL 8.0+](https://dev.mysql.com/downloads/mysql/)
- [MySQL Workbench](https://dev.mysql.com/downloads/workbench/) *(opcional, mas recomendado)*
- [NetBeans IDE](https://netbeans.apache.org/) ou [IntelliJ IDEA](https://www.jetbrains.com/idea/)
- Driver JDBC: `mysql-connector-j-8.x.x.jar`

---

## 🚀 Como Executar

### 1. Clone o repositório

```bash
git clone https://github.com/imnotsu/USJT---A3---Projeto-1.git
cd USJT---A3---Projeto-1
```

### 2. Configure o banco de dados

Abra o MySQL Workbench ou o terminal MySQL e execute o script de criação do banco:

```bash
mysql -u root -p < database/feed_database.sql
```

Ou execute manualmente o arquivo `database/feed_database.sql` pelo Workbench.

### 3. Configure a conexão

Edite o arquivo de conexão do projeto (ex: `src/util/Conexao.java`) com seus dados do MySQL:

```java
private static final String URL  = "jdbc:mysql://localhost:3306/feed_db";
private static final String USER = "root";
private static final String PASS = "sua_senha_aqui";
```

### 4. Adicione o driver JDBC

Na IDE, adicione o `mysql-connector-j.jar` ao classpath do projeto:
- **NetBeans:** Clique direito no projeto → Properties → Libraries → Add JAR/Folder
- **IntelliJ:** File → Project Structure → Modules → Dependencies → + JAR

### 5. Execute o projeto

Rode a classe `Main.java` (ou `Login.java`) para iniciar o sistema.

---

## 🗃️ Estrutura do Banco de Dados

O banco de dados `feed_db` contém as seguintes tabelas principais:

```
feed_db
├── usuarios          → Usuários do sistema (login e perfil)
├── beneficiarios     → Famílias/pessoas atendidas
├── doadores          → Pessoas físicas e empresas doadoras
├── alimentos         → Estoque de alimentos disponíveis
├── doacoes           → Registro de doações recebidas
└── distribuicoes     → Registro de entregas aos beneficiários
```

---

## 📁 Estrutura do Projeto

```
USJT---A3---Projeto-1/
├── src/
│   ├── model/            → Classes de entidade (Beneficiario, Doador, etc.)
│   ├── dao/              → Classes de acesso ao banco (CRUD via JDBC)
│   ├── view/             → Telas Java Swing (JFrame, JPanel)
│   ├── controller/       → Lógica de controle entre View e DAO
│   └── util/             → Conexão com o banco e utilitários
├── database/
│   └── feed_database.sql → Script de criação do banco de dados
└── README.md
```

---

## 👥 Equipe

Projeto desenvolvido por alunos da **USJT (Universidade São Judas Tadeu)** como avaliação A3.

| Nome Completo| GitHub |
|------|--------|
| Matheus Souza Gomes de Oliveira | [@INSIRAM SEUS GITHUBS](https://github.com/imnotsu) |
| Leonardo Arboleya | [@INSIRAM SEUS GITHUBS](https://github.com/imnotsu) |
| Fernando | [@INSIRAM SEUS GITHUBS](https://github.com/imnotsu) |
| Leonardo Gouveia | [@INSIRAM SEUS GITHUBS](https://github.com/imnotsu) |

> *R.A evitados passar pelo github, caso seja o professor e precise, entre em contato com Matheus*

---

## 🌍 ODS 2 — Fome Zero

<div align="center">

Este projeto é desenvolvido em apoio ao **Objetivo de Desenvolvimento Sustentável 2** da ONU:

> *"Acabar com a fome, alcançar a segurança alimentar e melhoria da nutrição e promover a agricultura sustentável."*

🔗 [Saiba mais sobre a ODS 2](https://brasil.un.org/pt-br/sdgs/2)

</div>

---

## 📄 Licença

Este projeto está sob a licença **MIT**. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

---

<div align="center">
Feito com ❤️ para combater a fome e apoiar quem de fato precisa.
</div>
