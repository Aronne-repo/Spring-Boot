# Spring Boot Library API

REST API built with Spring Boot, Spring Data JPA and SQLite.
The project manages a simple library system with books, authors and categories.
It exposes REST endpoints documented with Swagger UI and uses automatic database initialization for development.

---

## Technical Stack

Java 24
Spring Boot 4
Spring Web (REST API)
Spring Data JPA (Hibernate ORM 7)
SQLite JDBC
Lombok
Swagger / SpringDoc OpenAPI
DTO + Entity layered architecture
Page Object Model style layering (Controller → Service → Repository)

---

## Project Structure
```
com.aronnerepo.springboot
│
├── controller        # REST controllers
├── service           # Business logic
├── repository        # JPA repositories
├── entities          # Database entities
├── dto               # Data Transfer Objects
└── config            # Converters and configuration
```

---

## API Documentation

Swagger UI is available at:

http://localhost:8080/swagger-ui.html

OpenAPI JSON:

http://localhost:8080/v3/api-docs

---

## Database

The project uses SQLite as embedded database.

Database file:
```
library.db
```

---

## Installation

Clone the repository:

git clone <repository-url>
cd spring-boot-library

---

## Build the project:
```
mvn clean install
```

---

## Run the application:
```
mvn spring-boot:run
```

Or run directly from IDE (IntelliJ IDEA).

---

## Test the API

Once the application is running:

**Authors**
GET /api/authors → Get all authors
GET /api/authors/{id} → Get author by ID
POST /api/authors → Create new author
PUT /api/authors/{id} → Update author
DELETE /api/authors/{id} → Delete author

**Books**
GET /api/books
GET /api/books/{id}
POST /api/books
PUT /api/books/{id}
DELETE /api/books/{id}
Sample Data

**At startup the database is populated with:**

Authors (Tolkien, Orwell, King, etc.)
Books (The Hobbit, 1984, Clean Code, etc.)
Categories (Fantasy, Science Fiction, Programming, etc.)

---

## Known Issues / Notes

First startup may recreate schema via Hibernate
SQLite requires careful handling of:
dates (LocalDate → String conversion)
unique constraints (INSERT OR IGNORE used in seed data)
spring.jpa.hibernate.ddl-auto=update is used for development only
