🐾 PetCare Digital Solutions - Sistema de Gestão Veterinária
Este projeto foi desenvolvido como parte da atividade acadêmica da disciplina de Backend Java, com foco na criação de um sistema para clínicas veterinárias de pequeno porte. A aplicação permite o cadastro de animais, agendamento de consultas, e gerenciamento de histórico de vacinação e prontuários.

📌 Índice
🧠 Objetivo

📐 Diagrama de Classes

🛠 Tecnologias Utilizadas

📁 Estrutura do Projeto

⚙️ Funcionalidades

🔗 Endpoints

🧪 Testes com Thunder Client

👩‍💻 Equipe

📦 Como executar o projeto

🧠 Objetivo
Atender à demanda de clínicas veterinárias por meio de um sistema completo que modernize:

O cadastro de animais e seus tutores

O agendamento de consultas, com validação de disponibilidade e especialização do veterinário

O registro e consulta do histórico de vacinação e prontuários veterinários

📐 Diagrama de Classes

O diagrama representa as entidades principais e seus relacionamentos. Está disponível em documentacao/.

🛠 Tecnologias Utilizadas
Java 17+

Spring Boot 3.x

Spring Data JPA

H2 Database (em memória)

Jackson (para serialização JSON)

Thunder Client (para testes de API)

📁 Estrutura do Projeto
petcare/
├── controller/
├── entity/
├── repository/
├── service/
│   └── impl/
├── PetcareApplication.java
├── application.properties

⚙️ Funcionalidades
Cadastro de Tutores e Animais
Criar tutores com nome, CPF, telefone e endereço

Cadastrar animais vinculados a tutores

Agendamento de Consultas
Agendar consulta com validação:

Disponibilidade do veterinário

Especialização compatível com a espécie

Prontuários e Vacinas
Registro de atendimentos com observações

Registro e consulta de vacinas aplicadas

Visualização do histórico de vacinação por animal

🔗 Endpoints
🔹 Tutores
POST /tutores

GET /tutores

DELETE /tutores/{id}

🔹 Animais
POST /animais

GET /animais

GET /animais/tutor/{tutorId}

DELETE /animais/{id}

🔹 Veterinários
POST /veterinarios

GET /veterinarios

GET /veterinarios/especializacao/{especie}

🔹 Consultas
POST /consultas

GET /consultas

DELETE /consultas/{id}

🔹 Prontuários
POST /prontuarios

GET /prontuarios/animal/{animalId}

🔹 Vacinas
POST /vacinas

GET /vacinas/animal/{animalId}

🧪 Testes com Thunder Client
Todos os endpoints foram testados com o Thunder Client e uma coleção completa de testes está disponível no arquivo:

📁 documentacao/petcare-thunder-collection.json

Para importar:

Abra o Thunder Client no VS Code

Vá em "Collections" → "Import"

Selecione o arquivo .json fornecido