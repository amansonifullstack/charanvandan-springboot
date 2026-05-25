# Charanvandan Landing Page - Spring Boot (Java)

India's Trusted Crowdfunding Platform — built with Spring Boot 3, Thymeleaf, and vanilla CSS/JS.

---

## About This Project

**Charanvandan** is a landing page for an Indian crowdfunding platform. It is built using **Spring Boot (Java)** on the backend with **Thymeleaf** for server-side HTML rendering and plain CSS/JavaScript for the frontend.

---

## Tech Stack

| Technology | Version | Purpose |
|------------|---------|---------|
| Java | 17 | Programming language |
| Spring Boot | 3.2.5 | Backend framework |
| Thymeleaf | - | Server-side HTML template engine |
| Maven | 3.8+ | Build and dependency management |
| Vanilla CSS/JS | - | Frontend styling and animations (no React/Angular) |

---

## Project Structure

```
project root/
├── pom.xml                          ← Maven configuration (all dependencies)
├── README.md                        ← Project documentation
└── src/
    ├── main/
    │   ├── java/com/charanvandan/
    │   │   ├── CharanvandanApplication.java   ← Application entry point
    │   │   └── controller/
    │   │       └── HomeController.java        ← Handles routes and form logic
    │   └── resources/
    │       ├── application.properties         ← App configuration (port, etc.)
    │       ├── templates/
    │       │   └── index.html                 ← Main webpage (Thymeleaf template)
    │       └── static/
    │           ├── css/style.css              ← All styles
    │           ├── js/main.js                 ← Animations and scroll effects
    │           └── images/                    ← logo, hero, medical, education, social, spiritual
    └── test/
        └── java/com/charanvandan/
            └── CharanvandanApplicationTests.java  ← Unit test file
```

---

## File Descriptions

| File | Description |
|------|-------------|
| `CharanvandanApplication.java` | The main entry point of the application. Contains the `main()` method that starts Spring Boot. |
| `HomeController.java` | Handles the `/` route (homepage) and `/contact` route (form submission with validation). |
| `index.html` | The main webpage rendered using the Thymeleaf template engine. |
| `style.css` | All styles including responsive layout, sticky navbar, and hero section. |
| `main.js` | Scroll reveal animations and animated counters using the IntersectionObserver API. |
| `application.properties` | Configuration for server port, Thymeleaf settings, and logging. |
| `pom.xml` | Maven build file listing all project dependencies. |

---

## Port

The application runs on **port 8080**.

This is configured in `application.properties`:
```properties
server.port=8080
```

Access it locally at: **http://localhost:8080**

---

## Website Features

- Sticky navbar with smooth scroll
- Hero section with full-screen background image
- About / Mission section with core values
- Campaigns section: Medical, Education, Social, Spiritual
- Impact section with animated counters
- Testimonials section
- Contact form with server-side validation
- Footer with social links
- Scroll reveal animations (vanilla JavaScript)

---

## Setup Instructions

### Prerequisites

Make sure you have the following installed:
- Java 17 or higher
- Maven 3.8 or higher

### Run with Maven

```bash
# Step 1: Navigate to the project folder
cd charanvandan-springboot

# Step 2: Build the project
mvn clean install

# Step 3: Run the application
mvn spring-boot:run
```

Then open your browser and go to: **http://localhost:8080**

### Run with JAR file

```bash
# Build the JAR
mvn clean package

# Run the JAR
java -jar target/charanvandan-landing-1.0.0.jar
```

---

## Routes

`HomeController.java` handles the following routes:

| Route | Method | Description |
|-------|--------|-------------|
| `/` | GET | Renders the homepage (index.html) |
| `/contact` | POST | Handles contact form submission with validation |

### Contact Form Validation

| Field | Required | Validation Rule |
|-------|----------|-----------------|
| Name | Yes | Must not be blank |
| Email | Yes | Must not be blank and must be a valid email format |
| Message | Yes | Must not be blank |
| Phone | No | Optional |
| Campaign Type | No | Optional |

---

## Dependencies

| Dependency | Purpose |
|------------|---------|
| `spring-boot-starter-web` | Embedded web server and REST support |
| `spring-boot-starter-thymeleaf` | Server-side HTML templating |
| `spring-boot-starter-validation` | Form validation annotations (`@NotBlank`, `@Email`) |
| `spring-boot-devtools` | Auto-restart during development |
| `spring-boot-starter-test` | Testing support |
