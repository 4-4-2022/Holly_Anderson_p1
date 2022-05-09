# Holly's Hotel
Hotel Booking System API - Holly_Anderson_p1

## Concept
- 1.GuestsREST- A REST service, this allows crud commands on an api which connects to a SQL database.
- 2.ClientREST - A RESTful API, this is the only application that the client should interface with - all data flows through this API.
- 3.RoomsSoap - A SOAP service, this is the app that handles rooms.

## Functionality 
### 2.ClientREST- Run these on localhost
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

## Required Features

- [x] Documentation (all methods should have basic documentation)
- [ ] Unit testing (at least 30 unit tests)
- [x] Logging
- [x] 1 Java application that will serve as a public-facing REST API
- [x] At least 2 additional Java applications that will handle parts of the logic
- [x] At least 1 of the applications must be a SOAP service
- [x] All services must have their own, unique data source(s)

## Stretch Goals
- [ ] Distributed transactions using a Spring JTA implementation
- [ ] At least 1 JMS Topic for applications to communicate
- [ ] At least 1 JMS Queue for applications to communicate

## Required Technologies

- [x] Java
- [x] JUnit
- [x] Mockito
- [x] Logback
- [x] Git SCM (on GitHub)
- [x] Spring Framework
- [x] Spring Data JPA
- [x] Spring JMS Template
- [x] ActiveMQ
- [x] REST
- [x] SOAP
- [x] Spring Transactions (JTA)

## Notes
 - JTA - reservation info includes guest and room info
 - JMS - guest can place orders for rooms via id
