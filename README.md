# Spring Security Demo

## Overview

A simple Spring Boot project built to understand the fundamentals of Spring Security authentication using database-backed users.

This project demonstrates custom authentication flow using Spring Security, `UserDetailsService`, `UserPrincipal`, password encryption, and HTTP Basic authentication.

---

## Tech Stack

* Java
* Spring Boot
* Spring Security
* Spring Data JPA
* PostgreSQL
* Lombok
* Maven

---

## Features

* User registration
* Password hashing using BCrypt
* Database-backed authentication
* Custom `UserDetailsService`
* Custom `UserPrincipal`
* HTTP Basic authentication
* Protected endpoints

---

## Project Structure

```text
src/main/java/com/mickey/SpringSecurityDemo
│
├── config
│   └── SecurityConfig.java
│
├── controller
│   └── UserController.java
│
├── model
│   ├── User.java
│   └── UserPrincipal.java
│
├── repo
│   └── UserRepo.java
│
├── service
│   ├── MyUserDetailsService.java
│   └── UserService.java
```

---

## Authentication Flow

### Registration

* User submits username and password
* Password is hashed using BCrypt
* User is saved to PostgreSQL

### Authentication

* User accesses protected endpoint
* Spring Security triggers `UserDetailsService`
* User is fetched from database
* Password is verified
* Access is granted or denied

---

## Endpoints

### Register User

**POST**

```http
/users/register
```

Request:

```json
{
  "username": "mickey",
  "password": "123456"
}
```

---

### Get Users (Protected)

**GET**

```http
/users
```

Requires HTTP Basic authentication.

---

## Security Concepts Learned

* Spring Security filter chain
* Authentication provider
* DAO authentication provider
* UserDetails
* UserDetailsService
* GrantedAuthority
* PasswordEncoder
* BCrypt hashing
* Protected endpoints

---

## How to Run

1. Configure PostgreSQL in `application.properties`
2. Run the application
3. Register a user
4. Access protected endpoint with credentials

---

## Future Improvements

* JWT authentication
* Role-based authorization
* Exception handling
* Validation
* API response standardization

---

## Author

Mickey
