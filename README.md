# Student Microservice

Spring Boot service for managing students and their addresses with full CRUD operations and Swagger documentation.

## Features
- JPA Entities with Many-to-One relationship
- Cascade delete functionality
- Custom exception handling
- Swagger/OpenAPI 3 documentation
- H2 in-memory database
- RESTful endpoints

## Entity Relationship
![Class Diagram](https://github.com/user-attachments/assets/fef53b38-5ea8-4860-8c4d-d5d92776014b)

**Relationship**: Many Students ➔ One Address (`@ManyToOne` mapping)

## Tech Stack
- Java 17
- Spring Boot 3.1
- Spring Data JPA
- Hibernate
- mysql Database with docker compose
- Springdoc OpenAPI

## API Endpoints
| Method | Endpoint           | Description                |
|--------|--------------------|----------------------------|
| GET    | /api/students      | Get all students           |
| GET    | /api/students/{id} | Get student by ID          |
| POST   | /api/students      | Create new student         |
| PUT    | /api/students/{id} | Update existing student    |
| DELETE | /api/students/{id} | Delete student             |

# Swagger Endpoint 

| GET    | /swagger-ui/index.html | Swagger/OpenAPI 3 documentation |

![Swagger UI](https://github.com/user-attachments/assets/d66cd900-9abc-4b87-a04e-58996750377f)

## Run Locally
1. Clone repository
2. Run with Maven:
```bash
mvn spring-boot:run
