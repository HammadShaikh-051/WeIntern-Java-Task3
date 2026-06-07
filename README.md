# Production-Grade RESTful API Service with Spring Boot 3

A robust, enterprise-ready RESTful web service built using **Spring Boot 3.x** and **Java 17+**. This project implements production-level design patterns, including custom database migrations, automated request/response DTO mapping, strict token-based authentication, global error handling schemes, and full environment containerization.

This project was developed as part of the **Week 3 Intermediate/Advanced Assignment** for the **Java Developer Internship** at **WeIntern**.

---

## 📋 Table of Contents
- [Project Overview](#-project-overview)
- [Tech Stack](#-tech-stack)
- [Key Features & Architecture Tiers](#-key-features--architecture-tiers)
- [Database Schema & Migrations](#-database-schema--migrations)
- [API Documentation & Endpoints](#-api-documentation--endpoints)
- [Testing & Quality Assurance](#-testing--quality-assurance)
- [How to Run the Application (Docker)](#-how-to-run-the-application-docker)
- [About WeIntern Internship](#-about-weintern-internship)
- [License](#-license)

---

## 🚀 Project Overview

The objective of this assignment is to move away from local command-line systems and transition into building high-availability, secure enterprise APIs. The system showcases deep integration across the Spring ecosystem (Spring Web, Spring Security, Spring Data JPA) alongside modern DevOps container tooling.

### Core Implementation Pillars:
* **Secured Access Control:** Endpoints are strictly guarded behind JSON Web Token (JWT) stateless auth and rigid Role-Based Access Control (RBAC) rules.
* **Data Integrity & Evolution:** Utilizing enterprise database migration tools to track and run predictable relational schema updates.
* **Comprehensive Integration Testing:** Validation of end-to-end server layer logic using mocked servlet environments to ensure continuous reliability.

---

## 🛠️ Tech Stack

* **Framework Engine:** Spring Boot 3.x (Java 17+)
* **Security Layer:** Spring Security, JWT (JSON Web Tokens)
* **Data Management:** Spring Data JPA, Hibernate, PostgreSQL / H2 Database
* **Database Migrations:** Flyway / Liquibase
* **Object Mapping:** MapStruct (Compile-time DTO to Entity mapper)
* **API Documentation:** Springdoc OpenAPI (Swagger UI)
* **Containerization & Devops:** Docker, Docker Compose
* **Testing Suite:** JUnit 5, SpringBootTest, MockMvc

---

## API Testing

<img width="1092" height="854" alt="Screenshot 2026-06-07 121458" src="https://github.com/user-attachments/assets/e522d548-8549-4059-b5ef-657c6cc48fb9" />

<img width="1092" height="856" alt="Screenshot 2026-06-07 121651" src="https://github.com/user-attachments/assets/47aff713-153f-49a1-8473-d95be554a730" />

<img width="1095" height="898" alt="Screenshot 2026-06-07 121835" src="https://github.com/user-attachments/assets/2e79a953-98f0-4dbc-82c6-b6df5dc1238a" />


## ✨ Key Features & Architecture Tiers

### 1. Project Setup & Data Layer
* **Decoupled Layered Architecture:** Hard boundary separation between Controller, Service, Repository, and Data Transfer Object (DTO) layers.
* **Relational Entity Mapping:** Features a multi-entity relational schema model (e.g., `User` ↔ `Post` or similar relational structure) mapped cleanly via JPA annotations.
* **Automated Data Lifecycle:** Isolated schema evolutionary changes managed step-by-step through database migration versioning.

### 2. API & Security Layer
* **Standardized REST Handlers:** Clean, structured HTTP endpoints leveraging explicit verbs (`GET`, `POST`, `PUT`, `DELETE`) alongside context-appropriate HTTP status return codes.
* **Stateless JWT Security Engine:** Secure endpoints enabling user registration, token signature validation upon login, and token refresh verification routines.
* **Role-Based Access Control (RBAC):** Access control enforcement using specific authority mappings (`ROLE_USER`, `ROLE_ADMIN`).
* **Advanced Request/Response Structuring:** Zero data leak policy enforced by strict MapStruct conversions protecting core relational entities behind transient DTO definitions.
* **RFC 7807 Error Reporting:** Global controller advice intercepts backend runtime exceptions, returning standardized, uniform error payloads.

### 3. Testing, Documentation & DevOps
* **Self-Documenting Sandbox:** Automatically visualizes all active API paths via interactive Swagger UI views.
* **Dockerized Environments:** Multi-stage Docker configuration allowing entire backend service sets and related relational database images to spin up smoothly via single terminal instructions.

---

## 📁 Package Architecture

```text
src/
└── main/
    └── java/
        └── com/
            └── weintern/
                └── spring_boot_rest_api/
                    ├── controller/     # REST Controllers exposing resource paths
                    ├── model/         # Database Relational Model declarations
                    ├── exception/      # Custom domain exceptions & RFC 7807 Global Handler
                    ├── repository/     # Spring Data JPA repositories with custom JPQL queries
                    └── service/        # Core transactional business logic layer
