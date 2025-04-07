# :muscle: Java Gym Management System (with MSSQL Integration)

A fully functional **Java-based Gym Management System** with a user-friendly **GUI** and **Microsoft SQL Server (MSSQL)** integration. This system allows for the **entry and management of gym members and trainers**, tracking personal details, memberships, and training programs.

---

## :rocket: Features

- :white_check_mark: Add new **gym members**
- :white_check_mark: Add and manage **trainers**
- :white_check_mark: Store and retrieve details from **Microsoft SQL Server**
- :white_check_mark: Clean GUI built with **Java Swing**
- :white_check_mark: Input validation for form fields
- :white_check_mark: Scalable structure using **Object-Oriented Programming**

---

## :bricks: Technologies Used

- **Java (JDK 8+)**
- **Java Swing** (for GUI)
- **MSSQL Server** (as the backend database)
- **JDBC** (for database connectivity)

---

## :hammer_and_wrench: How to Run

1. **Clone the repository**:
   ```bash
   git clone https://github.com/dawoodkhatri1/Gym-Management-System.git
   ```

2. **Set up your MSSQL Database**:
   - Create a database (e.g., `gym_db`)
   - Run the provided SQL scripts or create tables manually:
     - `members`, `trainers`
   - Update `DatabaseConnection.java` with your MSSQL server details:
     ```java
     String url = "jdbc:sqlserver://localhost:1433;databaseName=gym_db";
     String user = "your_username";
     String password = "your_password";
     ```

3. **Build and run the project**:
   - Using IntelliJ IDEA, Eclipse, or NetBeans:
     - Open the project
     - Ensure JDBC driver (e.g., `mssql-jdbc.jar`) is in your classpath
     - Run `Main.java`

---

## :pushpin: Future Enhancements

- :busts_in_silhouette: Member login & profile management
- :calendar: Assign schedules to trainers and members
- :credit_card: Payment and subscription tracking
- :bar_chart: Dashboard with attendance and performance analytics
- :printer: Generate printable member/trainer reports

---

## :handshake: Contributing

Contributions are welcome! Fork the project, create a new branch, and submit a pull request.

---
