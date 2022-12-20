
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

#### Get result

```http
  GET localhost:8080/rps/play?playerOption={playerOption}
```

| Key            | Value     |
| :--------      | :-------  |    
| `playerOption` | `string`  |

<img width="638" alt="image" src="https://user-images.githubusercontent.com/60565112/208675488-4739b8ec-6061-4fa9-9f69-0fd584fcafd9.png">

## Swagger API Documentation

URL: http://localhost:8080/swagger-ui.html

<img width="960" alt="image" src="https://user-images.githubusercontent.com/60565112/208675795-550b8467-2620-431d-9c7c-3c4350df42ea.png">

