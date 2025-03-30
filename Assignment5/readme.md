# Java Servlet Assignment

## Objective
This project aims to help students understand Java Servlets by implementing key concepts such as CGI vs Servlets, Servlet API, Session Management, Request Dispatching, and Servlet Filters.

## Assignment Overview
### 1. CGI vs Servlets
#### Explanation:
- CGI (Common Gateway Interface) is an older method where each request creates a new process.
- Servlets run inside a web server (like Tomcat) and are more efficient as they use threads instead of creating new processes.
- Servlets are faster, scalable, and maintain session states more effectively.

#### Implementation:
- **CGI Program (Python/Perl)**: A script that processes a simple form submission.
- **Servlet Implementation**: A Java Servlet to handle the same functionality, showcasing performance improvements.

### 2. Servlet API & Basic Servlet Implementation
#### Tasks:
- Create a servlet that handles a GET request and returns a welcome message.
- Implement `doGet()` and `doPost()` methods.
- Retrieve query parameters from a URL.
- Display client details such as IP address and User-Agent.

### 3. ServletConfig & ServletContext
#### Tasks:
- Use `ServletConfig` to read parameters from `web.xml` (e.g., database settings).
- Use `ServletContext` to store and share application-wide data.

### 4. Session Management
#### Methods:
- **Cookies**: Store username and retrieve it on another page.
- **URL Rewriting**: Maintain session state by passing session ID in the URL.
- **HttpSession API**: Store user preferences like theme or language.

### 5. RequestDispatcher & Servlet Communication
#### Tasks:
- Implement a login system:
  - `LoginServlet` validates credentials.
  - If valid, forward the request to `WelcomeServlet`.
  - If invalid, redirect back to login with an error message.

### 6. Implementing Servlet Filters
#### Tasks:
- Create a **Logging Filter** to log request details (IP, time, requested URL).
- Create an **Authentication Filter** to restrict access to protected pages.

### Advanced Topics
- **Database Connection (JDBC)**: Validate users in the login system.
- **Servlet-based MVC Framework**: Servlets handle logic, JSP for presentation, and a database stores user data.
- **AJAX-based form submission**: Servlet returns a JSON response.

## Implementation Steps
### Prerequisites:
- Install Java (JDK 8+).
- Install Apache Tomcat.
- Configure Tomcat in IDE (Eclipse/IntelliJ).
- Set up a web project with `web.xml`.

### Steps to Run
1. **Set Up Project:**
   - Create a dynamic web project in Eclipse/IntelliJ.
   - Configure `web.xml` for servlet mappings.
   - Add necessary dependencies (JDBC for DB connection, JSON for AJAX response).
2. **Deploy on Tomcat:**
   - Run the project on a local Tomcat server.
   - Access servlets via browser (`http://localhost:8080/MyApp/ServletName`).
3. **Testing:**
   - Use a browser/Postman to test requests.
   - Check logs for filter behavior.
   - Verify session persistence.

## Expected Outcome
- Understanding of Java Servlets, HTTP request/response handling, session management, and filters.
- Hands-on experience with practical servlet applications.
- Ability to build a small web application using servlets.

---

Next, I'll provide the full implementation code for each servlet.

