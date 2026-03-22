# 🚀 Servlet Login & Registration System

A simple and complete user authentication system built using **Java Servlets, JDBC, MySQL, and Apache Tomcat**.

---

## 📌 Features

- ✅ User Registration
- ✅ User Login Authentication
- ✅ MySQL Database Integration
- ✅ JDBC Connectivity
- ✅ Simple & Clean UI (HTML Forms)

---

## 🛠️ Technologies Used

- Java (Servlets)
- JDBC
- MySQL (XAMPP)
- Apache Tomcat
- HTML

---

## 📁 Project Structure
Servlet Login & Registration System/
│
├── login.html
├── register.html
│
├── WEB-INF/
│ ├── web.xml
│ ├── lib/
│ │ └── mysql-connector-j-9.6.0.jar
│ │
│ └── classes/
│ ├── LoginServlet.class
│ ├── RegisterServlet.class
│ └── DBConnection.class




---

## ⚙️ Requirements

Make sure you have installed:

- Java JDK (17 or above)
- XAMPP (Apache + MySQL)
- Apache Tomcat (inside XAMPP)
- Git (optional)

---

## 🔗 Downloads

### 🔹 Java JDK
https://www.oracle.com/java/technologies/downloads/
<img width="1881" height="565" alt="image" src="https://github.com/user-attachments/assets/e056250d-add6-4526-adcb-abb1087238e8" />


### 🔹 XAMPP
https://www.apachefriends.org/download.html

### 🔹 MySQL Connector J (JDBC Driver)
https://dev.mysql.com/downloads/connector/j/

Download → Platform Independent → ZIP → Extract → get `.jar` file

---

## 🗄️ Database Setup

1. Open: http://localhost/phpmyadmin
2. 
2. Run:

```sql
CREATE DATABASE users_db;

USE users_db;

CREATE TABLE users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    email VARCHAR(100),
    password VARCHAR(100)
);

3. Compiling Command
javac -d . DBConnection.java
javac -cp ".;C:\xampp\tomcat\lib\servlet-api.jar" -d . RegisterServlet.java
javac -cp ".;C:\xampp\tomcat\lib\servlet-api.jar" -d . LoginServlet.java
