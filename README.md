# Project 2 Documentation

## Project name: Vaxify

By Abeil Adilow, Emilio Barajas, Anthony Escalante, Phuc Huynh 

## Project Description

   Vaccine Tracker will be an application that checks your vaccine status based off of the information in the database. There will be two accounts Customer and Professionals, customers will have to sign up for an account and link their account and medical information through their SSN. Customers will be able to check the vaccine status of themselves or the status of someone else through scanning a QR code while being able to generate their own from the app. The professional side will be for inputting or updating customer data, the customer side will never have access on this side so there is not any risk of Sensitive Data Exposure. We are assuming this is a government assigned program so we will have every American in as a baseline with everyone being unvaccinated and update the list when a person gets their first shot and second shot along with what type of vaccine, where they got it, when they got it, and what batch it was in. 

## Technologies Used

* Frontend 
   - HTML/CSS/Bootstrap HTML 5
   - Angular 11
   - TypeScript
* Backend
   - Java 8
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

List of features ready
* Patient can login to their account and register for a new account and link it with their medical information
* Patient can change password 
* Patient can get their own vaccine status and generate a QR code for other to scan a see their status
* Patient can scan a QR code and get the status of other people
* Professional can Login to their account
* Professional update patient medical information

To-do list:
* Fix a few bugs that has the front end pointing to the wrong endpoint
* Add a statistics page for Professional to view

## Getting Started
   
git clone https://github.com/Revature-Project2-Team1/Project2_Backend.git

> Compile and run the java code for the server test DB connection  
> ./gradlew build in Vaccine_Tracker folder
- run in a IDE or Gradle 


## Usage

> You open index.htmnl to get a screen that lets you have three options login as customer, login as employee, and create user. From there you will login correctly (user, pass for customer, jpeters, Password1 for employee) and login again at the next page. You will be about to customer things like withdraw and deposit from the customer account and more admin things like look up accounts and transactions of accounts (user_id 8, account_number 1254 1234, transaction 18).

