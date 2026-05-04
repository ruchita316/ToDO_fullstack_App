# 📝 To-Do Full Stack Application

A simple and efficient full-stack To-Do application built using **Spring Boot** for the backend and **HTML, CSS, JavaScript** for the frontend. This project demonstrates REST API development, frontend-backend integration, and basic CRUD operations.

---

## 🚀 Features

* ➕ Add new tasks
* 📋 View all tasks
* ❌ Delete tasks
* 🔄 Real-time updates using REST APIs
* 💾 Persistent storage using database (MySQL / JPA)

---

## 🛠️ Tech Stack

### Backend

* Java
* Spring Boot
* Spring Data JPA
* MySQL

### Frontend

* HTML
* CSS
* JavaScript

---

## 📂 Project Structure

```
src/
 ├── main/
 │   ├── java/com/example/todo/
 │   │   ├── Task.java
 │   │   ├── TaskController.java
 │   │   ├── TaskRepository.java
 │   │   └── ToDoApplication.java
 │   └── resources/
 │       ├── application.properties
 │       └── static/
 │           ├── index.html
 │           ├── style.css
 │           └── script.js
```

---

## ⚙️ How to Run Locally

### 1️⃣ Clone the repository

```
git clone https://github.com/ruchita316/ToDO_fullstack_App.git
cd ToDO_fullstack_App
```

---

### 2️⃣ Configure Database

Update `application.properties`:

```
spring.datasource.url=jdbc:mysql://localhost:3306/todo_db
spring.datasource.username=YOUR_USERNAME
spring.datasource.password=YOUR_PASSWORD

spring.jpa.hibernate.ddl-auto=update
```

---

### 3️⃣ Run the application

```
mvn spring-boot:run
```

---

### 4️⃣ Open in browser

```
http://localhost:8080/index.html
```

---

## 📡 API Endpoints

| Method | Endpoint    | Description   |
| ------ | ----------- | ------------- |
| GET    | /tasks      | Get all tasks |
| POST   | /tasks      | Add new task  |
| DELETE | /tasks/{id} | Delete a task |

---

## 💡 Future Improvements

* ✏️ Edit tasks
* ✅ Mark tasks as completed
* 🔐 User authentication
* 🌐 Deployment (cloud hosting)
* 🤖 AI-based task prioritization

---



## 👩‍💻 Author

**Ruchita Chavan**
GitHub: https://github.com/ruchita316

---

## ⭐ Acknowledgements

This project was built as part of learning full-stack development and backend API design using Spring Boot.

---
