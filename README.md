# Blog Application (Spring Boot + JWT )
This project is a full-featured Spring Boot application that combines:
- JWT-based Authentication
- User, Post, Category & Comment Management
- Image Upload / Download Support
- RESTful API Architecture
---

# 🚀 Overview
## 🔐 Authentication & Authorization
- Login using JWT tokens
- Register new users
- Fetch currently logged-in user
- Role-based access (ADMIN, USER)
- Secure endpoints using Spring Security

## 🧑‍💻 User Management
- Create, update, delete users
- Admin-only delete operation
- Fetch all users / single user

## 🗂 Category Management
- Create, update, delete, get categories

## 📝 Post Management
- Create posts under user + category
- Search posts by title
- Pagination + sorting
- Upload post images
- Serve images via REST
## 💬 Comment Management
- Add comment to a post
- Delete comment

---

## 🧩 Tech Stack

| Technology | Category |
|-----------|-------------|
| **Spring Boot** |	Main framework |
| **Spring MVC** |	REST controllers |
| **Spring Security** |  JWT	Authentication |
| **Spring Data JPA** |	ORM & DB queries |
| **ModelMapper** |	DTO Mapping |
| **MySQL** |	Database |
| **Lombok** |	Reducing boilerplate |

---

## 🏗️ Project Structure
```
src/main/java/in/ankit
 ├── controllers
 │     ├── AuthController.java
 │     ├── CategoryController.java
 │     ├── CommentController.java
 │     ├── PostController.java
 │     └── UserController.java
 │
 ├── config
 │     └── AppConstants.java
 │
 ├── entities
 │     ├── User.java
 │     ├── Post.java
 │     ├── Category.java
 │     └── Comment.java
 │
 ├── payloads
 │     ├── JwtAuthRequest.java
 │     ├── JwtAuthResponse.java
 │     ├── UserDto.java
 │     ├── PostDto.java
 │     ├── CategoryDto.java
 │     ├── CommentDto.java
 │     └── ApiResponse.java
 │
 ├── services
 │     ├── UserService.java
 │     ├── PostService.java
 │     ├── CategoryService.java
 │     ├── CommentService.java
 │     ├── FileService.java
 │     └── impl...
 │
 ├── security
 │     ├── JwtTokenHelper.java
 │     ├── JwtAuthenticationFilter.java
 │     └── SecurityConfig.java
 │
 │
 └── Application.java

       
```

## 🖥️ How to Run
Clone the repository:
```
git clone https://github.com/ankitrajj/BLOG-App-with-SpringBoot.git
```
Navigate into the project folder:
```
cd <project-folder>
```
Run the application:
```
mvn spring-boot:run
```
Open in browser:
```
http://localhost:8080/
```

  
