# 📚 Atividade 4 - AC2

Este repositório contém os arquivos referentes à **Atividade 4 - AC2**, desenvolvida como parte da disciplina [Desenvolvimento Web Back-End].

## 👥 Integrantes do grupo

| Nome           | RA      |
|----------------|---------|
| Amanda Prado   | 235343  |
| Kalled Abdala  | 234846  |
| Laura Bonilha  | 236167  |
| Maria Neri     | 234910  |

## 📄 Levantamento Requisitos

[Levantamento Requisitos.docx](https://github.com/KalledAbdala/Atividade_4_Ac2/blob/main/LevantamentoRequisitos.docx)

## 📃 Diagrama de classes

[Diagrama de Classes.pdf](https://github.com/KalledAbdala/Atividade_4_Ac2/blob/main/Diagrama%20de%20Classes.pdf)

## 🧠 Objetivo
Atender à demanda de clínicas veterinárias por meio de um sistema completo que modernize:

O cadastro de animais e seus tutores

O agendamento de consultas, com validação de disponibilidade e especialização do veterinário

O registro e consulta do histórico de vacinação e prontuários veterinários

## 🛠 Tecnologias Utilizadas
Java 17+

Spring Boot 3.x

Spring Data JPA

H2 Database (em memória)

Jackson (para serialização JSON)

Thunder Client (para testes de API)

## 📁 Estrutura do Projeto
petcare/
├── controller/
├── entity/
├── repository/
├── service/
│   └── impl/
├── PetcareApplication.java
├── application.properties

## ⚙️ Funcionalidades
- Cadastro de Tutores e Animais
- Criar tutores com nome, CPF, telefone e endereço
- Cadastrar animais vinculados a tutores
- Agendamento de Consultas
- Agendar consulta com validação:
- Disponibilidade do veterinário
- Especialização compatível com a espécie
- Prontuários e Vacinas
- Registro de atendimentos com observações
- Registro e consulta de vacinas aplicadas
- Visualização do histórico de vacinação por animal

## 🔗 Endpoints
## 🔹 Tutores
POST /tutores
GET /tutores
DELETE /tutores/{id}

## 🔹 Animais
POST /animais
GET /animais
GET /animais/tutor/{tutorId}
DELETE /animais/{id}

## 🔹 Veterinários
POST /veterinarios
GET /veterinarios
GET /veterinarios/especializacao/{especie}

## 🔹 Consultas
POST /consultas
GET /consultas
DELETE /consultas/{id}

## 🔹 Prontuários
POST /prontuarios
GET /prontuarios/animal/{animalId}

## 🔹 Vacinas
POST /vacinas
GET /vacinas/animal/{animalId}

## 🧪 Testes com Thunder Client
Todos os endpoints foram testados com o Thunder Client e uma coleção completa de testes está disponível no arquivo:

## 📁 documentacao/petcare-thunder-collection.json
Para importar:
Abra o Thunder Client no VS Code
Vá em "Collections" → "Import"
Selecione o arquivo .json fornecido
