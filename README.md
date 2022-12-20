
# Natwest Rps Assignment

A rock-paper-scissors game microservice as an assignment for Java & Microservices Development internship at the NatWest group.


## Requirements

- JDK 17
- Spring Boot v2.7.6
- Springfox Swagger v2.9.2
- Maven


## Run Locally

Clone the project

```bash
  git clone https://github.com/Yash-Chandrani/NatwestGameAssignment.git
```

Run the file NatwestGameAssignmentApplication.java inside src/main/java/com/yash/assignment

```bash
  cd src/main/java/com/yash/assignment/NatwestGameAssignmentApplication.java
```
## Run Tests

Run the file NatwestGameAssignmentTests.java inside src/test/java/com/yash/assignment

```bash
  cd src/test/java/com/yash/assignment/NatwestGameAssignmentTests.java
```

#### Get all items

```http
  GET localhost:8080/rps/play?playerOption={playerOption}
```

| Key            | Value     |
| :--------      | :-------  |    
| `playerOption` | `string`  |

![App Screenshot](https://via.placeholder.com/468x300?text=App+Screenshot+Here)
## Swagger API Documentation

http://localhost:8080/swagger-ui.html

![App Screenshot](https://via.placeholder.com/468x300?text=App+Screenshot+Here)

