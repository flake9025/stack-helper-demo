# Multi Tier Stack Builder Helper Demo

- Master (1.0.0) : See the Stack Builder Helper project here :
https://github.com/flake9025/stack-helper

This demo project is using Spring Boot with Swagger and H2 database.

You will be able to create, update, delete and find pets ! enjoy :)

## Prerequisites
- JDK 8
- Maven

## Getting Started

Get the stack helper repository and run : 
- mvn clean install

Then, get the stack helper demo repository, and run :
- mvn clean install

From now on, you will be able to run the demo application :
- java -jar ./target/stack-helper-demo-1.0.0-SNAPSHOT.jar

Open the following URL in your web browser :
http://localhost:8080/swagger-ui.html

Try it !

## Examples

http://localhost:8080/pets

```json
{"content":[{"id":1,"name":"Cat","friends":null},{"id":2,"name":"Dog","friends":["Poney","Fish"]},{"id":3,"name":"Poney","friends":["Dog","Fish"]},{"id":4,"name":"Fish","friends":["Dog","Poney"]}],"pageable":{"sort":{"sorted":false,"unsorted":true},"offset":0,"pageSize":30,"pageNumber":0,"paged":true,"unpaged":false},"last":true,"totalPages":1,"totalElements":4,"size":30,"number":0,"sort":{"sorted":false,"unsorted":true},"numberOfElements":4,"first":true}
```

http://localhost:8080/pets?name=Dog&page=0

```json
{"content":[{"id":2,"name":"Dog","friends":["Poney","Fish"]}],"pageable":{"sort":{"sorted":false,"unsorted":true},"offset":0,"pageSize":30,"pageNumber":0,"paged":true,"unpaged":false},"last":true,"totalPages":1,"totalElements":1,"size":30,"number":0,"sort":{"sorted":false,"unsorted":true},"numberOfElements":1,"first":true}
```

