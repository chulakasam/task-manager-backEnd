

# Task Manager Application

## Overview

This is a **Task Manager** application that allows users to create, update, delete, and view tasks. It is developed using **Angular** for the frontend and **Spring Boot** for the backend. The application enables users to manage tasks with details like title, description, status, and creation date.

## Features

- **Create Task**: Add new tasks with a title, description, status, and creation date.
- **View Task**: View all tasks in a list with their details.
- **Update Task**: Edit the details of an existing task.
- **Delete Task**: Remove tasks from the list.
- **Task Status**: Mark tasks as **Completed**, **Pending**, or **Not Started**.
- **Responsive Design**: Works well on both desktop and mobile devices.

## Technologies Used

### Frontend:
- **Angular**: For building the single-page web application.
- **HTML/CSS**: For structuring and styling the application.
- **Bootstrap**: For styling the components and ensuring a responsive design.
- **RxJS**: For handling asynchronous events in Angular.
- **Forms (Reactive Forms/Template-Driven Forms)**: For task creation and editing.

### Backend:
- **Spring Boot**: For building the backend RESTful APIs.
- **Spring Data JPA**: For database interaction.
- **MySQL Database**: To persist task data.


## Installation

### Prerequisites

Make sure you have the following installed:

- **Node.js** (for running Angular frontend)
- **Java 8 or higher** (for running Spring Boot backend)
- **Gradle** (for building the Spring Boot application)
- **MySQL** (for storing task data)

### Frontend Setup (Angular)

1. Clone this repository to your local machine.

   ```bash
   git clone https://github.com/chulakasam/task-manager-frontEnd.git
   cd task-manager/frontend
   ```
   ```bash
   git clone https://github.com/chulakasam/task-manager-backEnd.git
   cd task-manager/backend
   ```

2. Install the required npm dependencies.

   ```bash
   npm install
   ```

3. Run the Angular development server.

   ```bash
   ng serve
   ```

   The application should now be available at `http://localhost:4200`.

### Backend Setup (Spring Boot)

1. Navigate to the backend folder of the project.

   ```bash
   cd task-manager/backend
   ```

2. Build the Spring Boot application using Maven.

   ```bash
   mvn clean install
   ```

3. Run the Spring Boot application.

   ```bash
   mvn spring-boot:run
   ```

   The backend should now be available at `http://localhost:5050`.

### Configuration

1. In `src/main/resources/application.properties` (for Spring Boot), configure your database connection.

   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/task
   spring.datasource.username=root
   spring.datasource.password=password
   spring.jpa.hibernate.ddl-auto=update
   ```

2. Make sure the Angular frontend is configured to communicate with the correct backend URL.

   If needed, The correct API URL (`http://localhost:5050/taskManager`).

## API Endpoints

### Task Management

- **GET** `/api/v1/task`: Retrieve all tasks.
- **GET** `/api/v1/task/{id}`: Retrieve a specific task by ID.
- **POST** `/api/v1/task`: Create a new task.
- **PUT** `/api/v1/task/{id}`: Update an existing task by ID.
- **DELETE** `/api/v1/task/{id}`: Delete a task by ID.


.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

Let me know if you need any modifications or additional details!