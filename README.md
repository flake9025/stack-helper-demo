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

## Database console

http://localhost:8080/h2-console

## Examples

All pets sorted by name
http://localhost:8080/pets?sort=name

```json
{"content":[{"id":8,"name":"Cachou","age":8,"male":true,"friends":["Uline"]},{"id":7,"name":"Donught","age":2,"male":false,"friends":["Uline"]},{"id":6,"name":"Isis","age":9,"male":false,"friends":["Tchicky"]},{"id":3,"name":"Jobar","age":4,"male":false,"friends":["Teddy","Neige"]},{"id":4,"name":"Neige","age":1,"male":false,"friends":["Teddy","Jobar"]},{"id":9,"name":"Tchicky","age":5,"male":true,"friends":["Vanille"]},{"id":2,"name":"Teddy","age":11,"male":true,"friends":["Jobar","Neige"]},{"id":5,"name":"Uline","age":10,"male":false,"friends":["Neige","Cachou"]},{"id":1,"name":"Vanille","age":13,"male":false,"friends":[]}],"pageable":{"sort":{"sorted":true,"unsorted":false},"offset":0,"pageNumber":0,"pageSize":30,"paged":true,"unpaged":false},"totalPages":1,"totalElements":9,"last":true,"size":30,"number":0,"sort":{"sorted":true,"unsorted":false},"numberOfElements":9,"first":true}
```
Pets with name = vanille
http://localhost:8080/pets?name=vanille

```json
{"content":[{"id":1,"name":"Vanille","age":14,"male":false,"friends":[]}],"pageable":{"sort":{"sorted":false,"unsorted":true},"offset":0,"pageSize":30,"pageNumber":0,"unpaged":false,"paged":true},"totalPages":1,"last":true,"totalElements":1,"size":30,"number":0,"sort":{"sorted":false,"unsorted":true},"numberOfElements":1,"first":true}
```
Pets with age = 10
http://localhost:8080/pets?age=10

```json
{"content":[{"id":5,"name":"Uline","age":10,"male":false,"friends":["Neige","Cachou"]},{"id":6,"name":"Isis","age":10,"male":false,"friends":["Tchicky"]}],"pageable":{"sort":{"sorted":false,"unsorted":true},"offset":0,"pageSize":30,"pageNumber":0,"unpaged":false,"paged":true},"totalPages":1,"last":true,"totalElements":2,"size":30,"number":0,"sort":{"sorted":false,"unsorted":true},"numberOfElements":2,"first":true}
```
Pets with age = 8 OR age = 10
http://localhost:8080/pets?age=8&age=10
```json
{"content":[{"id":5,"name":"Uline","age":10,"male":false,"friends":["Neige","Cachou"]},{"id":8,"name":"Cachou","age":8,"male":true,"friends":["Uline"]}],"pageable":{"sort":{"sorted":false,"unsorted":true},"offset":0,"pageNumber":0,"pageSize":30,"paged":true,"unpaged":false},"totalPages":1,"totalElements":2,"last":true,"size":30,"number":0,"sort":{"sorted":false,"unsorted":true},"numberOfElements":2,"first":true}
```

http://localhost:8080/pets?age=8&male=true
```json
{"content":[{"id":8,"name":"Cachou","age":8,"male":true,"friends":["Uline"]}],"pageable":{"sort":{"sorted":false,"unsorted":true},"offset":0,"pageSize":30,"pageNumber":0,"unpaged":false,"paged":true},"totalPages":1,"last":true,"totalElements":1,"size":30,"number":0,"sort":{"sorted":false,"unsorted":true},"numberOfElements":1,"first":true}
```
