## 4.02-SpringBootAPIRest-L1

This project is a RESTful application built with **Spring Boot** that manages an entity called **Fruit**, persisted in an **H2 in-memory database** using the **JPA** specification, and structured following the **MVC (Model-View-Controller)** pattern.

## 📦 Package Structure

The project is organized under the base package `cat.itacademy.s04.t02.n01` with the following structure:

- `controllers`: Handles HTTP requests (REST API)
- `model`: Contains the `Fruit` entity
- `repository`: Defines the JPA interface for persistence
- `services`: Contains business logic
- `exception`: Manages custom exceptions and global error handling

The Fruita entity represents a product with a unique identifier, a name, and a quantity in kilograms.

### 🔗 Available Endpoints
| Method | URL                                | Description                                |
|--------|-------------------------------------|--------------------------------------------|
| POST   | `/fruita/add`                       | Adds a new fruit to the database           |
| PUT    | `/fruita/update`                    | Updates an existing fruit                  |
| DELETE | `/fruita/delete/{id}`               | Deletes a fruit by its ID                  |
| GET    | `/fruita/getOne/{id}`               | Retrieves a single fruit by its ID         |
| GET    | `/fruita/getAll`                    | Retrieves all fruits                       |



Aquest projecte és una aplicació RESTful desenvolupada amb Spring Boot que gestiona una entitat anomenada **Fruita**, persistent a una base de dades **H2** mitjançant l’especificació **JPA**, i estructurada seguint el patró **MVC (Model-View-Controller)**.

### 📦 Estructura de Paquets

El projecte està organitzat dins el package principal `cat.itacademy.s04.t02.n01` amb la següent estructura:

- `controllers`: Gestiona les peticions HTTP (API REST)
- `model`: Conté l'entitat `Fruita`
- `repository`: Defineix la interfície JPA per a la persistència
- `services`: Conté la lògica de negoci
- `exception`: Gestiona excepcions personalitzades i el manejador global

L'entitat Fruita representa un producte amb un identificador únic, un nom i una quantitat en quilos.

### 🔗 Endpoints disponibles

| Mètode | URL                                 | Descripció                                      |
|--------|--------------------------------------|-------------------------------------------------|
| POST   | `/fruita/add`                        | Afegeix una nova fruita a la base de dades      |
| PUT    | `/fruita/update`                     | Actualitza una fruita existent                  |
| DELETE | `/fruita/delete/{id}`                | Elimina una fruita pel seu ID                   |
| GET    | `/fruita/getOne/{id}`                | Recupera una fruita pel seu ID                  |
| GET    | `/fruita/getAll`                     | Recupera totes les fruites                      |


### 💻Stack used: Project created with:

    Java v.21
    Spring Boot 3.4.5:
        Spring Data JPA
        Spring Web
        Spring Boot DevTools
    H2 Database (in-memory)
    Maven v.3.9.9.
    IDE IntelliJ Idea v. 24.3.1.1

📋Requirements: No specific requirement but the Java and Maven version or newer.

🛠️Installation:

    Clone this repo: -> git clone

▶️Execution: No specific instruction.

🌐Deployment: N/A.

🤝Contributions:

Contributions are welcome! Please follow the following steps to contribute:

    Fork the repository.
    Create a new: git checkout branch -b feature/News.
    Make your changes and commit them: git commit - 'Add New Functionality'.
    Upload the changes to your branch: git push feature/News.
    Do a pull request.
