# Simple Spring Boot Login Application with Spring Security
A modern **Spring Boot 3.5** application implementing secure login using **Spring Security**, **MySQL**, and **Session-Based **. It demonstrates custom login forms, user registration, password hashing with **BCrypt**, and RESTful API with OpenAPI/Swagger UI documentation.

## 📌 Features

✅ User Registration with validation  
✅ Custom HTML Login Form  
✅ Spring Security (Session-Based Auth)  
✅ BCrypt Password Encoding  
✅ Staff CRUD endpoints  
✅ MySQL Integration using Spring Data JPA  
✅ Input Validation with Hibernate Validator  
✅ OpenAPI Documentation using Swagger UI  
✅ Secure Routes + Static File Login Page  
✅ Role-ready architecture (simplified)  

---

## 📁 Technologies Used

- Java 21 (JDK 21+)
- Spring Boot 3.5.0
- Spring Security
- Spring Data JPA
- MySQL 8
- Hibernate Validator
- Lombok
- Swagger (springdoc-openapi)
- Maven

---

## 🧰 Setup Instructions

### 1. ⚙️ Prerequisites

- Java 21 or higher  
- MySQL running on port `3306`  
- IDE (IntelliJ, Eclipse, or VS Code)  
- Maven installed

---

### 2. 💽 MySQL Configuration

Make sure you have a MySQL database named:
Database: staffDatabase
Username: root
Password: (empty or your own)


### 3. ⚙️ `application.properties`

```properties
spring.application.name=johnsecurity

# Database
spring.datasource.url=jdbc:mysql://localhost:3306/staffDatabase
spring.datasource.username=root
spring.datasource.password=
spring.datasource-driver-class-name=com.mysql.cj.jdbc.Driver

# JPA
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

# Security logging
logging.level.org.springframework.security=DEBUG
logging.level.org.hibernate.sql=DEBUG

4. 🚀 Run the Application

mvn spring-boot:run

🧪 API Endpoints
| Method | Endpoint             | Description             | Auth Required |
| ------ | -------------------- | ----------------------- | ------------- |
| POST   | `/api/v1/register`   | Register a staff user   | ❌ No          |
| GET    | `/api/v1/home`       | Home Page (after login) | ✅ Yes         |
| GET    | `/api/v1/staff/{id}` | Get staff by ID         | ✅ Yes         |
| GET    | `/getDetails`        | List all staff          | ❌ No          |
| POST   | `/login`             | Login form              | ❌ No          |

📄 Login page is served from static/login.html

🔐 Security Configuration
    Custom login page: /login.html
    Successful login: redirects to /api/v1/home
    Unauthorized requests: redirected to login
    Passwords: securely hashed using BCryptPasswordEncoder

🧾 Swagger UI
📍 Visit: http://localhost:8080/swagger-ui.html
Make sure you added this dependency:

<dependency>
  <groupId>org.springdoc</groupId>
  <artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
  <version>2.8.9</version>
</dependency>


👨‍💻 Developer Info

    ✍️ Author: Revocatus Joseph Nduki
    💼 Passionate about backend security, Spring Boot, and secure systems

📄 License
This project is licensed for educational and learning purposes. You can extend it and build production-ready applications.

    ⚠️ Note: This is a simplified project for learning Spring Security. For real-world projects, consider adding JWT, CSRF protection, roles, error handling, DTOs, and exception mappers.
