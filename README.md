#Library-Management-System

Library Management System (Spring Boot)
A Library Management System built using Spring Boot that helps manage books, users, and transactions like issuing and returning books.
This project follows a RESTful architecture and uses MySQL as the backend database.


Features
✅ Book Management
Add, update, view, and delete books
Search books by title, author, or category

✅ User Management
Register and manage library users
View user details and issued books

✅ Issue/Return Books
Issue books to users with due dates
Return books and calculate fines (if any)

✅ Admin Panel
Admin can view all users and all books
Admin can manage transactions

✅ Database Integration
Fully integrated with MySQL using Spring Data JPA
Uses relational mapping between Books, Users, and Transactions


Library Management System
│
├── src
│   ├── main
│   │   ├── java/com/example/library
│   │   │   ├── controller     # REST Controllers
│   │   │   ├── service        # Business logic layer
│   │   │   ├── repository     # Database access layer (JPA)
│   │   │   ├── dto            # Data Transfer Objects
│   │   │   └── model          # Entity classes (Book, User, Transaction)
│   │   └── resources
│   │       ├── application.properties  # Database config
│   │       └── data.sql / schema.sql   # Initial data (optional)
│   └── test/java/...                   # Unit and Integration tests
│
├── pom.xml                            # Maven dependencies
└── README.md



Tech Stack
Backend:
Java 21
Spring Boot 3.x
Spring Data JPA
Spring Web
Hibernate

Database:
MySQL

Build Tool:
Maven

Postman (API Testing)
IntelliJ IDEA / Eclipse
