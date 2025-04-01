# 🚀Real-Time Event Ticketing System

## ➡️Overview
The Real-Time Event Ticketing System is a robust application designed to simulate producer concumer pattern.This is a full-stack real-time ticketing app where multiple vendors
and customers access a shared ticket pool. Used a simulated
producer-consumer pattern for efficient distribution and ensured
thread safety with synchronized data structures like Synchronized
ArrayList.

**🔴use master branch to find project codes**
**🔴Link to front-end : https://github.com/Nawoda2-0/OOP-CW-Front-end.git**

## 🎯Features


- **🎫Real-Time Ticketing:** Purchase and reserve tickets with real-time updates.
- **🕺Multiple producer concumer:** Multiple producer and consumer sell and buy tickets simultaneously.
- **😍Dinamic GUI:** Realtime updating GUI using webshockets.
- **⁉️Error Handling:** Comprehensive logging and error management.

## ⚙️Tech Stack
### Backend
- **Language:** Java
- **Framework:** Spring Boot
- **Database:** PostgreSQL
- **Other Tools:** JDBC, JPA, Spring Security

### Frontend
- **Framework:** React (with Vite)
- **Styling:** CSS

### Other Tools
- **Version Control:** Git & GitHub
- **IDE:** IntelliJ IDEA

## 🔋Installation

### Prerequisites
- Java 17+
- Node.js 16+
- PostgreSQL
- Maven
- IntelliJ IDEA or preferred IDE

### Backend Setup
1. Clone the repository:
   ```bash
   git clone <repository-url>
   cd <repository-folder>
   ```
2. Configure the `application.properties` file for your PostgreSQL setup:
   ```properties
   spring.datasource.url=jdbc:postgresql://localhost:5432/ticketing_system
   spring.datasource.username=<your-username>
   spring.datasource.password=<your-password>
   spring.jpa.hibernate.ddl-auto=update
   ```
3. Build and run the Spring Boot application:
   ```bash
   mvn clean install
   mvn spring-boot:run
   ```

### Frontend Setup
1. Navigate to the frontend folder:
   ```bash
   cd frontend
   ```
2. Install dependencies:
   ```bash
   npm install
   ```
3. Start the development server:
   ```bash
   npm run dev
   ```

### Database Setup
1. Ensure PostgreSQL is installed and running.
2. Create a database named `ticketing_system`.
3. Use the Spring Boot application to auto-generate tables or run the provided SQL scripts (if any).

## Usage
- Access the application at `http://localhost:3000` for the frontend.
- Use the CLI for admin-specific commands like adding events or monitoring logs.

## Future Improvements
- Integration of payment gateways.
- Enhanced UI/UX for the frontend.
- Deployment to cloud platforms.
- Real-time notifications using WebSockets.

##📃 License
Copyright  `@Nawoda` 


##📱 Contact
For any inquiries, please reach out to:
- **Email:** nawodasilva2001@gmail.com
- **GitHub:** [Your GitHub Profile](https://github.com/nawoda2-0)
