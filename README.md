# Holly's Hotel

## Project Description
This hotel booking API allows users to create, update, read, and delete guests and rooms at a hotel. It consists of: 1.GuestsREST - A REST service, this allows crud commands on an api which connects to a SQL database, 2.ClientREST - A RESTful API, this is the only application that the client should interface with - all data flows through this API, and 3.RoomsSoap - A SOAP service, this is the app that handles rooms.

## Technologies Used
- Java
- Logback
- Git SCM (on GitHub)
- Spring Framework
- Spring Data JPA
- Spring JMS Template
- ActiveMQ
- REST
- SOAP
- Spring Transactions (JTA)

## Future Goals
- Link records for guests and rooms by date

## Getting Started
 - Clone this repository 
 - Run all three apps in your IDE (e.g. Spring Tool Suite)
 - Go to localhost:8081 on Advanced Rest Client or Postman
 
 ## Usage 
- POST /rooms/new - create new room
- GET /rooms/all - read all rooms 
- PUT /rooms/update - edit room info
- DELETE /rooms/delete - delete room from DB
- GET /rooms/test - tests connection to java without SQL
- GET /guest/all - read all guests
- POST /guest/new - create new guest
- GET /guest/{id} - read info on one guest
- PUT /guest/update - edit guest info 
- DELETE /guest/delete - delete guest from DB
- GET /guest/test - tests connection to java without SQL
