# Project 2 Documentation

## Project name: Vaccine Tracker

By Abeil Adilow, Emilio Barajas, Anthony Escalante, Phuc Huynh 

## Project Description

   Vaccine Tracker will be an application that checks your vaccine status based off of the information in the database. There will be two accounts Customer and Professionals, customers will have to sign up for an account and link their account and medical information through their SSN. Customers will be able to check the vaccine status of themselves or the status of someone else through scanning a QR code while being able to generate their own from the app. The professional side will be for inputting or updating customer data, the customer side will never have access on this side so there is not any risk of Sensitive Data Exposure. We are assuming this is a government assigned program so we will have every American in as a baseline with everyone being unvaccinated and update the list when a person gets their first shot and second shot along with what type of vaccine, where they got it, when they got it, and what batch it was in. 

## Technologies Used

* Frontend 
   - HTML/CSS/Bootstrap HTML 5
   - Angular 11
   - TypeScript
* Backend
   - Java8
   - Spring
   - Hibernate/JPA
   - Swagger
* Database 
   - PostgreSQL
* Devops
   - Jenkins 
   - Git
   - Gradle
* Agile Scrum
   - Trello
* AWS
   - RDS
   - S3
   - EC2
* Testing
   - Junit 
   - Mockito
   - log4J
   - Jasmine, Karma
   - Jacoco
   - Postman

## Features

List of features ready and TODOs for future development
* Create a new customer or employee in the DB
* Get account transactions from current accounts 
* Get account details
* Withdraw and deposit mone in customer account by updating DB 
* Delete accounts pending approval from the account table

To-do list:
* Finish CSS to make the HTML look more presentable
* Fix accept and reject commands in employee page

## Getting Started
   
git clone https://github.com/Anthony-Tag/Revature_Bank_App.git

> Compile and run the java code for the server and DB connection  
> ./gradlew build in Vaccine_Tracker folder and 
- run in a IDE or Gradle 

## User stories

* Customer:
   - Login 
   - Create account and link it with medical information
   - Retrieve email if forgotten with SSN for security
   - Change password
   - Get vaccine status
   - Generate QR code with vaccine status
   - Get other customers information from a QR code

* Professional:
   - Login
   - Update customer medical information
   - Get statistics by full database or by location and will be shown in pie charts


## Features

List of features ready and TODOs for future development
* Create a new customer or employee in the DB
* Get account transactions from current accounts 
* Get account details
* Withdraw and deposit mone in customer account by updating DB 
* Delete accounts pending approval from the account table

To-do list:
* Finish CSS to make the HTML look more presentable
* Fix accept and reject commands in employee page

## Getting Started
   
git remote add origin https://github.com/Anthony-Tag/Revature_Bank_App.git

> Compile and run the java code for the server and DB connection  
> Open up the Index.html in the browser and pick a login

- run in a IDE or Gradle 

## Usage

> You open index.htmnl to get a screen that lets you have three options login as customer, login as employee, and create user. From there you will login correctly (user, pass for customer, jpeters, Password1 for employee) and login again at the next page. You will be about to customer things like withdraw and deposit from the customer account and more admin things like look up accounts and transactions of accounts (user_id 8, account_number 1254 1234, transaction 18).
