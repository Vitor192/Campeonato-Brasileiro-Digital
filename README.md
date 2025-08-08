# 🏆 Campeonato Brasileiro - Pontos Corridos

Este projeto implementa um **sistema de gerenciamento do Campeonato Brasileiro** no formato de **pontos corridos**, desenvolvido em **Java 17** com persistência em **H2 Database**.  
O objetivo é simular partidas, registrar resultados e calcular a classificação final de acordo com as regras oficiais.

---

## 📜 Regras do Campeonato

- **Formato:** Pontos Corridos (sem grupos, sem mata-mata)
- **Quantidade de Times:** 20
- **Critério de Vitória:** O time com mais pontos no final vence
- **Pontuação:**
  - Vitória → **3 pontos**
  - Empate → **1 ponto**
  - Derrota → **0 pontos**
- **Jogos:** Todos jogam contra todos

---

## 📌 Exemplo de Times

- São Paulo FC  
- Corinthians  
- Palmeiras  
- Santos  

*(Os demais times podem ser cadastrados via API)*

---

## 🗂 Estrutura do Projeto

### **Entidades**
- **Time**
  - `nome`
  - `sigla`
  - `estado`

- **Jogo**
  - `time1`
  - `time2`
  - `golsTime1`
  - `golsTime2`

- **Classificação**
  - Calculada automaticamente com base nos jogos cadastrados

---

## ⚙️ Funcionalidades da API

- **Cadastrar time**
- **Listar times**
- **Cadastrar jogos**
- **Cadastrar resultados**
- **Calcular classificação**

---

## 🛠 Tecnologias Utilizadas

- **Java 17**
- **Spring Boot**
- **H2 Database**
- **Maven**
- **REST API**

---

## 💾 Banco de Dados

O projeto utiliza **H2 Database** (banco em memória) para facilitar o desenvolvimento e testes.  
A interface web do H2 pode ser acessada em:



---

## 🚀 Como Executar o Projeto

```bash
# Clonar o repositório
git clone https://github.com/seu-usuario/campeonato-brasileiro.git

# Acessar o diretório do projeto
cd campeonato-brasileiro

# Executar a aplicação
mvn spring-boot:run

# API estará disponível em:

http://localhost:8080

#📌 Exemplos de Requisições
Cadastrar Time

POST /times
Content-Type: application/json

{
  "nome": "São Paulo FC",
  "sigla": "SPF",
  "estado": "SP"
}

# Listar Times

GET /times


# Cadastrar Jogo

POST /jogos
Content-Type: application/json

{
  "time1": 1,
  "time2": 2,
  "golsTime1": 2,
  "golsTime2": 1
}

# Classificação

GET /classificacao



