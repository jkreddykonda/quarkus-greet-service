# Quarkus Greet Service - Technical Assessment

This project is developed as part of a technical assessment using **Quarkus 3.6.2**, **Java 21**, and **Maven**.

---

## Project Structure

- `controller/` ➔ REST API layer for Person management.
- `entity/` ➔ JPA Entity for Person data.
- `repository/` ➔ Panache Repository for CRUD operations on Person.
- `test/` ➔ JUnit 5 test cases for API validation.

---

## Use Cases Implemented

- **Create a new Person**  
  ➔ `POST /persons`  
  ➔ Accepts JSON input `{ "name": "Alice", "birthDate": "1995-06-15" }`
  
- **List all Persons**  
  ➔ `GET /persons`
  
- **Find a Person by Name**  
  ➔ `GET /persons/search/{name}`

- **Health Check Endpoint**  
  ➔ `GET /q/health`  
  ➔ Verifies basic application health.

---

## Technologies Used

- Java 21
- Quarkus 3.6.2
- RESTEasy Reactive
- Panache ORM
- H2 In-Memory Database (development mode)
- JUnit 5

---

## How to Run

1. **Start Quarkus App in Dev Mode:**

   ```bash
   ./mvnw compile quarkus:dev
   ```

2. **Access Application:**
   - API Base URL: `http://localhost:8081`

3. **Swagger UI (Optional):**
   - You can add Swagger UI extension later if needed.

---

## Sample API Calls

- **Create a Person**
  ```bash
  POST http://localhost:8081/persons
  Content-Type: application/json
  
  {
    "name": "Alice",
    "birthDate": "1995-06-15"
  }
  ```

- **Get All Persons**
  ```bash
  GET http://localhost:8081/persons
  ```

- **Search Person by Name**
  ```bash
  GET http://localhost:8081/persons/search/Alice
  ```

- **Health Check**
  ```bash
  GET http://localhost:8081/q/health
  ```

---

## Notes

- The database used is **H2** (memory only for dev).
- No external configuration needed to start.
- Application automatically reloads on code changes in dev mode.
- Health Check includes custom simulated DB status check.

---
