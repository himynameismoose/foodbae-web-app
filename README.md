# FoodBae in the Bay!
This is a web application built by Java Spring Boot backend with React.js frontend to demonstrate a fullstack web application.

<img width="1440" alt="foodTruckList1" src="https://user-images.githubusercontent.com/32172992/167493894-5d1e0908-5279-4427-897f-831354d3f5dc.png">

# Spring Boot Backend

This was built using Spring Boot dependencies:

<img width="1440" alt="pomfile" src="https://user-images.githubusercontent.com/32172992/167494805-cb7f7815-a598-4928-9d00-0c4840979274.png">

The pom.xml includes Spring Boot Web, MySQL, JPA, Lombok. I need Spring Boot to run the application through Apache Tomcat to be access in my local server at localhost:8080. The database will be built via MySQL Workbench where I can access and view data outside of the application. JPA is implemented to access its JPARepository library to build the CRUD methods in a REST API. The REST API will be accessed by React to access the database to be used for the web app interface. Lombok is added to use notation for the model of a Food Truck.

<img width="1440" alt="foodtruckmodel" src="https://user-images.githubusercontent.com/32172992/167496385-201afea8-b243-460c-a0d8-e2ecc55e60d6.png">

The FoodTruck.java model is the food truck entity. This will create a table called foodtrucks in the database. This model uses Lombok annotation for getters and setters and JPA annotation to create an entity and the name of the table, if it does not already exist in the database.

<img width="780" alt="app-props" src="https://user-images.githubusercontent.com/32172992/167498360-6afb9799-833e-4f72-9e82-ef3e87d57fc3.png">

These are configurations that will need to be added in order for spring boot to connect to MySQL.

<img width="770" alt="repository" src="https://user-images.githubusercontent.com/32172992/167497316-f5f48ec4-91ad-4f48-bd93-198dd6b8da75.png">

This interface will be using the JPARepository to use existing CRUD methods that will be inherited to be implemented for the REST API.

<img width="1163" alt="sb-service" src="https://user-images.githubusercontent.com/32172992/167497697-47760fe4-60d5-4022-ad98-661f538ac719.png">

This class will use the repository interface that will inherit the CRUD methods from JPARepository to create CRUD methods to be used for the REST API.

This is the controller that will be used by React to implement CRUD methods for the interface.

<img width="978" alt="controller1" src="https://user-images.githubusercontent.com/32172992/167498986-8a7bde4e-9fe2-45e1-b121-4f373d047bef.png">
<img width="1035" alt="controller2" src="https://user-images.githubusercontent.com/32172992/167499004-7996445b-b416-4654-b8bb-14e2e640a5b3.png">

I modeled my application by separating my frontend using React (view) from the backend Spring Boot (model, controller)

<img width="539" alt="view-spring-boot" src="https://user-images.githubusercontent.com/32172992/167499725-af7f0b92-1690-45f8-a197-cb3cfff39bc2.png">
<img width="345" alt="view-react" src="https://user-images.githubusercontent.com/32172992/167499763-54a927f4-b61c-40d9-8815-9f3e00e08fef.png">

# React.js Frontend

<img width="1440" alt="foodTruckList2" src="https://user-images.githubusercontent.com/32172992/167500229-5145d6ba-21b2-4a33-8329-9825a842bea7.png">

The react application will start on this page with a list prepopulated by using the REST API method getAllFoodTrucks() built in the backend. The table shows the name and address of a food truck and action buttons to update or delete the food truck. At the top of the list is a button that allows the user to add a food truck. 

<img width="1440" alt="addFoodTruck1" src="https://user-images.githubusercontent.com/32172992/167500714-af99f8ab-4dd2-4b63-856d-c0645206009b.png">

# Add Food Truck

The Add Food Truck button takes us to the Add Truck Form page. The route is given "/add-foodtruck" and a form to add name, address and food type. There are action buttons at the bottom of the form to either submit or cancel. Both buttons will take you to "/foodtrucks" route. If a food truck is added, the list will reload and the added truck will be visible.

<img width="1440" alt="addFoodTruck2" src="https://user-images.githubusercontent.com/32172992/167501209-771773fd-ed90-4917-8250-a0484d2f9a98.png">
<img width="1440" alt="addFoodTruck3" src="https://user-images.githubusercontent.com/32172992/167501241-3e41d180-92da-4436-b23e-620338031ca1.png">

# Update Food Truck

<img width="1440" alt="updateFoodTruck2" src="https://user-images.githubusercontent.com/32172992/167501497-db00ed84-ee5b-44e6-857d-29e4127086e4.png">
<img width="1440" alt="updateFoodTruck3" src="https://user-images.githubusercontent.com/32172992/167501516-d2a2c36b-50a6-497c-a248-9f73e44af19b.png">

Clicking on the Update action button will allow the user to edit a food truck. The similar form is used to prepopulate data from the truck intended to update. Once updated, the route is back to "/foodtrucks" with an update of the food truck details.

To update the food truck, the id is grabbed from the REST API update method and the fields will make a call to the database to update columns.

# Delete Food Truck

<img width="1440" alt="deleteFoodTruck1" src="https://user-images.githubusercontent.com/32172992/167501793-df53d19f-f9da-406f-952d-f9b7c374a1e1.png">
<img width="1440" alt="deleteFoodTruck2" src="https://user-images.githubusercontent.com/32172992/167501818-4d52083d-cc7b-4d8b-a63f-26b8d3caccf8.png">

The Delete action button allows the user to delete a food truck from the list. The intended food truck to be deleted is grabbed by its id making a call to the REST API and deletes the record.

# Outro

Thank you for viewing my web application!
