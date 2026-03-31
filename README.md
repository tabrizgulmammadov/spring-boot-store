# 🛒 Store

A Spring Boot e-commerce REST API with JWT authentication, cart management, order processing, and Stripe payment integration.

## Tech Stack

- **Java 17+** / Spring Boot
- **Spring Security** + JWT
- **JPA / Hibernate** + MySQL
- **Flyway** – database migrations
- **MapStruct** – DTO mapping
- **Stripe** – payment gateway

## Features

- 🔐 JWT-based auth (register, login, change password)
- 🛍️ Product catalog with categories
- 🛒 Cart management (add, update, remove items)
- 📦 Order creation and tracking
- 💳 Stripe checkout & webhook handling
- 👤 User profile management
- 🛡️ Role-based access control (admin/user)

## Getting Started

### Prerequisites

- Java 21
- MySQL
- Maven

### Run
```bash
# Dev profile
./mvnw spring-boot:run -Dspring-boot.run.profiles=dev
```

Configure your environment variables in `application-dev.yaml`:
```yaml
spring.datasource.url: ...
spring.datasource.username: ...
spring.datasource.password: ...
jwt.secret: ...
stripe.secret-key: ...
```

## Database Migrations

Managed by Flyway under `src/main/resources/db/migration`.

## License

MIT