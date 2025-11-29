# library-management-system

📚 Library Management System

A full-stack Library Management System built with HTML/CSS/JavaScript (Frontend) and Java Spring Boot (Backend). It provides secure authentication using JWT, book management, book issuing/returning, and complete REST APIs following 3-layer architecture.


---

👥 Developers

Name Roll No College

Kushagar 230851010184 R.V Higher Education and Technical Institute
Ankush 230851010162 R.V Higher Education and Technical Institute



---

🚀 Project Features

🔐 Authentication

Login and Register using JWT Authentication

Secured API access

Role-based access (Admin / User)


📖 Book Management

Add books

Update books

Delete books

Get all books

Search books by ID, name, author, category


📚 Issue & Return System

Issue a book to a student

Return book

Check availability


👨‍🏫 Student & Librarian Management

Add/update student details

Manage librarian accounts


🧪 Backend Features

Java Spring Boot + Hibernate ORM

MySQL Database

DTO + Entity design

Exception handling

Postman API Testing

Layered architecture (Controller → Service → Repository)


🌐 Frontend Features

HTML/CSS-based UI

Responsive pages

JavaScript form validation

Simple and clean design



---

🧱 Technologies Used

Frontend

HTML5

CSS3

JavaScript


Backend

Java

Spring Boot

Hibernate / JPA

Spring Security + JWT

MySQL Database

Maven

REST Architecture


Tools

Postman

VS Code

IntelliJ

Git & GitHub



---

📁 Project Folder Structure

Library-Management-System/
│
├── frontend/
│   ├── assets/
│   │   ├── css/
│   │   ├── js/
│   │   └── images/
│   ├── index.html
│   ├── style.css
│   ├── README.md
│   
│
├── backend/
│   ├── src/main/java/com/project/library/
│   │   ├── controller/
│   │   ├── service/
│   │   ├── repository/
│   │   ├── model/
│   │   ├── dto/
│   │   
│   ├── src/main/resources/
│   │   ├── application.properties
│   │   └── static/
│   ├── pom.xml
│   └── README.md
│
└── README.md  (main)


---

🏗 3-Layer Architecture (Spring Boot)

1️⃣ Controller Layer

Handles HTTP requests, routes URLs, sends responses.

2️⃣ Service Layer

Contains business logic:

Validations

Processing

Transforming DTO ↔ Entity


3️⃣ Repository Layer

Database operations using:

Hibernate

JPA Repositories



---

🛢 Database Schema

Tables

users

roles

books

students

issued_books



---

▶️ How to Run the Backend

1. Clone the repository

git clone https://github.com/kushagar0206/library-management-system

2. Configure MySQL

Create a database:

CREATE DATABASE library;

3. Update application.properties

spring.datasource.url=jdbc:mysql://localhost:3306/library
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
jwt.secret=your-secret-key

4. Run the Spring Boot Application

mvn spring-boot:run

Backend will start at
👉 http://localhost:8080


---

🌐 How to Run the Frontend

Simply open:

frontend/index.html

Or double-click the file in your system.


---

📌 API Endpoints (Examples)

Auth APIs

Method Endpoint Description

POST /api/auth/register Register new user
POST /api/auth/login Login & get JWT


Books APIs

Method Endpoint Description

POST /api/books/add Add new book
GET /api/books/all Get all books
PUT /api/books/update/{id} Update book
DELETE /api/books/delete/{id} Delete book


Issue APIs

Method Endpoint Description

POST /api/issue Issue book
POST /api/return Return book



---

⭐ Future Enhancements

React or Angular UI

Admin dashboard

Fine calculation

Email reminders

Dark/light theme



---

📜 License

This project is created for educational / academic learning purposes.
