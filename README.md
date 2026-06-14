# Employee Management System

A web-based Employee Management System developed using Java, JSP, Servlets, JDBC, and MySQL. The application helps organizations manage employee records efficiently by providing CRUD (Create, Read, Update, Delete) operations through a user-friendly interface.

## 🚀 Features

- Add new employees
- View employee details
- Update employee information
- Delete employee records
- Search employees
- Responsive and user-friendly interface
- Database connectivity using JDBC
- Secure data management with MySQL

## 🛠️ Technologies Used

### Frontend
- HTML
- CSS
- JSP

### Backend
- Java
- Servlets
- JDBC

### Database
- MySQL

### Tools
- Eclipse IDE / IntelliJ IDEA
- Apache Tomcat Server
- Git & GitHub

## 📂 Project Structure

```
EmployeeManagementSystem
│
├── src/
│   ├── controller/
│   ├── dao/
│   ├── model/
│   └── utility/
│
├── WebContent/
│   ├── jsp/
│   ├── css/
│   └── images/
│
├── database/
│   └── employee_db.sql
│
└── README.md
```

## ⚙️ Installation & Setup

1. Clone the repository

```bash
git clone https://github.com/your-username/EmployeeManagementSystem.git
```

2. Import the project into Eclipse or IntelliJ IDEA.

3. Configure Apache Tomcat Server.

4. Create a MySQL database.

```sql
CREATE DATABASE employee_db;
```

5. Import the SQL file provided in the project.

6. Update database credentials in the JDBC configuration file.

```java
String url = "jdbc:mysql://localhost:3306/employee_db";
String username = "root";
String password = "your_password";
```

7. Run the project on Tomcat Server.

## 💻 Usage

- Launch the application.
- Add employee details.
- View all employees.
- Update employee information whenever required.
- Delete records that are no longer needed.

## 🎯 Learning Outcomes

Through this project, I gained practical experience in:

- Java Web Development
- JSP and Servlets
- JDBC Connectivity
- MySQL Database Management
- MVC Architecture
- CRUD Operations
- Git and GitHub Version Control

## 👨‍💻 Author

**Debanjali Saha**

BCA Student | Java Developer

## 📄 License

This project is created for educational and learning purposes.
