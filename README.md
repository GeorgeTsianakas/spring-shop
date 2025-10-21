# Spring Shop REST API

Simple, test-friendly REST API built with Spring Boot. This project demonstrates clean controller/service/repository layering, DTO mapping with MapStruct, persistence with Spring Data JPA over an in-memory H2 database, and interactive API documentation via Swagger (Springfox).

![Java](https://img.shields.io/badge/Java-8-blue?style=flat&logo=openjdk) ![Spring Boot](https://img.shields.io/badge/Spring%20Boot-2.2.x-brightgreen?style=flat&logo=spring-boot) ![Build](https://img.shields.io/badge/Build-Maven-informational?style=flat&logo=apache-maven)

---

## Overview
The API models a simple shop domain with Categories, Customers, and Vendors. It exposes CRUD endpoints for Customers and Vendors and read-only endpoints for Categories. The project is intentionally compact to make it easy to explore, extend, and use for experiments with Spring Boot features and testing.

The example data and endpoints are conceptually aligned with the public Predic8 "Shop API" documentation:
- https://api.predic8.de/shop/docs

## Features
- Spring Boot 2.2 with Spring MVC
- DTO mapping with MapStruct (component model: spring)
- Spring Data JPA with H2 in-memory database (auto-created at startup)
- Swagger 2 (Springfox) with annotations for interactive docs
- Layered architecture with services and repositories
- Unit and integration tests with JUnit + Spring Test

## Quickstart
Prerequisites:
- Java 8 (JDK 1.8)
- Git (optional)
- Maven is included via the Maven Wrapper (mvnw), so no local Maven install is required

Clone and run (Windows PowerShell):
- git clone <this-repo-url>
- cd spring-shop
- .\mvnw clean package
- .\mvnw spring-boot:run

The app will start on http://localhost:8080

Alternatively, run the built JAR:
- java -jar .\target\spring-shop-0.0.1-SNAPSHOT.jar

## API Documentation (Swagger)
- Swagger UI: http://localhost:8080/swagger-ui.html
- The Swagger metadata is configured in src/main/java/com/springrest/shop/config/SwaggerConfig.java

## REST Endpoints (Summary)
Base path for all controllers is versioned under /api/v1.

Categories (read-only):
- GET /api/v1/categories — List all categories
- GET /api/v1/categories/{name} — Get category by name

Customers:
- GET /api/v1/customers — List all customers
- GET /api/v1/customers/{id} — Get a customer by ID
- POST /api/v1/customers — Create a new customer
- PUT /api/v1/customers/{id} — Replace an existing customer
- PATCH /api/v1/customers/{id} — Partially update a customer
- DELETE /api/v1/customers/{id} — Delete a customer

Vendors:
- GET /api/v1/vendors — List all vendors
- GET /api/v1/vendors/{id} — Get a vendor by ID
- POST /api/v1/vendors — Create a new vendor
- PUT /api/v1/vendors/{id} — Replace an existing vendor
- PATCH /api/v1/vendors/{id} — Partially update a vendor
- DELETE /api/v1/vendors/{id} — Delete a vendor

## Sample Payloads
Customer (POST/PUT/PATCH request body):
{
  "firstname": "Joe",
  "lastname": "Bloggs"
}

Vendor (POST/PUT/PATCH request body):
{
  "name": "Fresh Fruits Ltd"
}

## Running Tests
Execute the full test suite:
- .\mvnw test

## Project Structure
- src/main/java/com/springrest/shop/controllers/v1 — REST controllers
- src/main/java/com/springrest/shop/services — Service interfaces and implementations
- src/main/java/com/springrest/shop/repositories — Spring Data JPA repositories
- src/main/java/com/springrest/shop/api/v1/model — DTOs
- src/main/java/com/springrest/shop/api/v1/mapper — MapStruct mappers
- src/main/java/com/springrest/shop/config — Swagger configuration
- src/test/java/com/springrest/shop — Unit and integration tests

## Configuration
- Database: H2 in-memory (no configuration required). The schema is created automatically via JPA at runtime. No credentials are required.
- Application properties: src/main/resources/application.properties (empty by default; customize as needed)

## Alternative Branches
This repository provides additional branches with different implementations that you may find useful:
- reactive-master — Reactive version using Spring WebFlux
- xml-jaxb-master — XML-focused variant using JAXB for marshalling
- dependabot/* — Automated dependency update branches

You can inspect them locally with:
- git fetch --all --prune
- git branch -a
- git checkout reactive-master  (or xml-jaxb-master)

## Contributing
Feel free to open issues or pull requests to suggest improvements or new examples.

## License
This project is provided for educational and demonstration purposes. Add a LICENSE file if you intend to distribute under a specific license.
