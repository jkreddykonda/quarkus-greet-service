
## Quarkus Coding Exercises

This section covers three Quarkus-based coding tasks using CDI, Panache, and MicroProfile.

---

## 2.1 - REST Endpoint with Path/Query Params and CDI

This task builds a greeting endpoint that accepts path and optional query parameters.

- Created a CDI bean GreetingService with greet(String name)  
- Injected GreetingService into a REST controller  
- Exposed a GET endpoint: `/greet/{name}?suffix=Smith`  
- Appends suffix if provided — returns: `"Hello AliceSmith!"`

---

## 2.2 - Persistence with Panache

This task implements basic CRUD operations using PanacheRepository.

- Created a `Person` JPA entity with fields: `name`, `birthDate`  
- Created `PersonRepository` implementing PanacheRepository  
- Configured H2 as in-memory dev database (no persistence.xml needed)  
- Exposed REST endpoints:  
- `POST /persons` — Add a new person  
- `GET /persons` — List all persons  
- `GET /persons/search/{name}` — Find person by name  
- JSON body example:
```json
{
  "name": "Alice",
  "birthDate": "1995-06-15"
}
```

---

## 2.3 - MicroProfile Health Check

This task adds a custom health check to the `/q/health` endpoint.

- Implemented a class `DatabaseConnectionHealthCheck`  
- Annotated with `@Readiness`  
- Simulated check result: `"Database connections health check"`  
- Health endpoint: `GET /q/health`  
- Returns:
```json
{
  "status": "UP",
  "checks": [
    {
      "name": "Database connections health check",
      "status": "UP",
      "data": {
        "<default>": "UP"
      }
    }
  ]
}
```

---
