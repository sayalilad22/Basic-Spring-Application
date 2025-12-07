# Basic Spring Application

A simple Spring Boot REST API application for managing users.

## Technologies

- Spring Boot 3.3.2
- Spring Data JPA
- H2 Database (in-memory)
- Java 17
- Maven

## Features

- Create and retrieve users
- In-memory H2 database
- RESTful API endpoints

## Running the Application

```bash
mvn spring-boot:run
```

The application will start on `http://localhost:8080`

## API Endpoints

### Create User
```
POST /users
Content-Type: application/json

{
  "name": "John Doe",
  "age": 25
}
```

### Get All Users
```
GET /users
```

## Building

```bash
mvn clean install
```
