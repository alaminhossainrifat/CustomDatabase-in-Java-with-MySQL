# CustomDatabase - Java MySQL Database Creator

## 📌 Overview
CustomDatabase is a simple Java program that connects to a MySQL server and creates a new database. This project demonstrates how to use **JDBC (Java Database Connectivity)** to interact with a MySQL database.

## 🛠️ Features
- Connects to a MySQL server using JDBC.
- Creates a new database dynamically.
- Implements exception handling for missing drivers and SQL errors.

## 🚀 Prerequisites
Before running this project, ensure you have the following installed:

- **Java Development Kit (JDK)**  
- **MySQL Server** (Ensure it's running)  
- **MySQL Connector/J (JDBC Driver)** ([Download Here](https://dev.mysql.com/downloads/connector/j/))  

## ⚙️ Setup Instructions

### 1️⃣ Install MySQL JDBC Driver
- Download the **MySQL Connector/J** `.jar` file.  
- Add it to your project's classpath.

### 2️⃣ Configure Database Credentials
Update the following variables in `CustomDatabase.java`:
```java
static final String USER = "your_mysql_username";
static final String PASSWORD = "your_mysql_password";
static final String JDBC_URL = "jdbc:mysql://localhost:3306/";
```

### 3️⃣ Compile and Run
#### Using Command Line
```sh
javac -cp ".;mysql-connector-java-<version>.jar" CustomDatabase.java
java -cp ".;mysql-connector-java-<version>.jar" CustomDatabase
```
*(Replace `<version>` with the actual version of MySQL Connector/J you downloaded.)*

#### Using an IDE (IntelliJ, Eclipse, VS Code)
- Add **MySQL Connector/J** to the classpath.
- Run the `CustomDatabase.java` file.

## 🛑 Error Handling
- If you see **"MySQL JDBC Driver not found"**, ensure the JDBC driver is added to your classpath.  
- If you see **"Access denied"**, check your MySQL credentials.  
- If **database already exists**, modify `databaseName` or check if the database was previously created.

---
🔨 **Happy Coding!** 🔧
