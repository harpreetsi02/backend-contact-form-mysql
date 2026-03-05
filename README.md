# Contact Form API

A simple backend application built with Spring Boot that allows users to submit contact form details which are stored in a MySQL database. The API supports saving and retrieving contact messages using RESTful endpoints.

## Features

* Submit contact form data
* Store form data in MySQL database
* Retrieve all submitted contact messages
* RESTful API design
* Clean layered architecture (Controller → Service → Repository)

## Tech Stack

* Java
* Spring Boot
* Spring Web
* Spring Data JPA
* MySQL
* Maven
* Postman (for API testing)

## API Endpoints

### Submit Contact Form

POST /contact

Example Request:
{
"name": "Harpreet",
"email": "harpreet@test.com,
"message": "Hello, I want to contact you."
}

### Get All Contacts

GET /contact

Returns a list of all submitted contact messages.

## Project Structure

controller → Handles API requests
service → Contains business logic
repository → Database interaction using JPA
entity → Contact entity mapped to database table

## Run Locally

1. Clone the repository
   git clone https://github.com/yourusername/contact-form-api.git

2. Navigate to project folder
   cd contact-form-api

3. Configure MySQL database in application.properties

4. Run the application
   mvn spring-boot:run

Server runs at:
http://localhost:8080
