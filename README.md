# 📦 SmartShelf

SmartShelf is a web-based inventory management system built using Spring Boot and MySQL. It helps users manage products, departments, and inventory efficiently through a secure login system and an intuitive interface.

---

## 🚀 Features

- 🔐 Secure login using Spring Security
- 🔑 BCrypt password encryption
- 📦 Product management (Create, Read, Update, Delete)
- 🏢 Department management
- 🔍 Search functionality
- 🌙 Light/Dark mode
- 👁️ Show/Hide password
- 📱 Clean and responsive UI

---

## 🛠️ Tech Stack

- Java 17
- Spring Boot
- Spring Security
- Spring Data JPA (Hibernate)
- MySQL
- Thymeleaf
- HTML5
- CSS3
- Maven

---

## 📂 Project Structure

```
src
 ├── controller
 ├── entity
 ├── repository
 ├── security
 ├── service
 ├── templates
 ├── static
 └── resources
```

---

## ⚙️ Installation

1. Clone the repository

```bash
git clone https://github.com/YOUR_USERNAME/SmartShelf.git
```

2. Open the project in Eclipse or IntelliJ.

3. Create a MySQL database.

```sql
CREATE DATABASE smartshelf;
```

4. Configure `application.properties` with your MySQL username and password.

5. Run the application.

---

## 🔒 Authentication

Passwords are encrypted using BCrypt before being stored in the database.

Spring Security is used for authentication and authorization.

---

## 📸 Screenshots

(Add screenshots here later.)

---

## 🎯 Future Improvements

- Dashboard with inventory statistics
- Low-stock alerts
- Category management
- Stock history
- Export inventory to Excel/PDF
- User roles (Admin/Employee)

---

## 👨‍💻 Author

**Niran**
