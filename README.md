# Car Production API Project

This project includes an interface called "Car" which includes method called "getType()" and three classes "Sedan, Cabrio, Hatchback" which implement the Car interface.

# How To Use

User can create an instance of one of the car classes and call the getType() method of it. The getType() will return type of the car.
``` Cabrio cabrio = new Cabrio();
String type = cabrio.getType(); // "Cabrio"
 ```
User can call produceCar() method of CarController, provide car type and get result according to provided parameter. For example if provided type is "cabrio", the result will be "Cabrio car has been produced.". If parameter is something else than Sedan, Cabrio or Hatchback, then result will be "Invalid car type".
 ```  
 String result = CarController.produceCar("cabrio"); // "Cabrio car has been produced."
 ``` 
 
 [![Run in Postman](https://run.pstmn.io/button.svg)](https://app.getpostman.com/run-collection/21725579-ac38cfca-d80d-43b8-ba2e-00e5644d559e?action=collection%2Ffork&collection-url=entityId%3D21725579-ac38cfca-d80d-43b8-ba2e-00e5644d559e%26entityType%3Dcollection%26workspaceId%3D32a4b27d-b395-4131-b3a9-3b9dafff3c8a)
 
Also here, [Postman Collection](./CarCollection)

# Unit Tests

This project includes unit test for each classes and controller. For running tests in JUnit you can use command:
 ``` 
./gradlew test
 ``` 
 
# Contact

[Linkedin](https://www.linkedin.com/in/gozdemogus/)

