# Projeto JPA com PostgreSQL - Simulação de Marca, Acessório e Carro

Este projeto demonstra o uso do **Java Persistence API (JPA)** integrado com um banco de dados **PostgreSQL**, utilizando entidades que representam uma estrutura de veículos com **Marca**, **Acessório** e **Carro**. Além disso, testes unitários foram implementados com **JUnit** para garantir o correto funcionamento das operações de persistência.

## 💡 Objetivo

Criar uma aplicação simples para simular o relacionamento entre marcas, carros e seus acessórios, explorando os principais conceitos de persistência com JPA em um banco de dados não relacional (PostgreSQL) e garantindo a qualidade com testes automatizados.

## 🛠 Tecnologias Utilizadas

- Java 11+  
- JPA / Hibernate  
- PostgreSQL  
- JUnit 5  
- Maven ou Gradle (dependendo do seu projeto)

## 🧩 Entidades Modeladas

- **Marca**: Representa o fabricante do carro.  
- **Carro**: Entidade principal, associada a uma marca e contendo uma lista de acessórios.  
- **Acessório**: Representa itens opcionais ou adicionais de um carro.

## 🔍 Testes

Os testes foram criados utilizando o **JUnit** para validar:

- Criação e persistência das entidades  
- Relacionamentos entre Marca, Carro e Acessório  
- Recuperação e manipulação dos dados no banco

## 🚀 Como executar

1. Clone o repositório:

   ```bash
   git clone https://github.com/seu-usuario/seu-repositorio.git
   cd seu-repositorio
