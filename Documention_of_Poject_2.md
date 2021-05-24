# Project 2 Documentation

## Project name: Vaccine Tracker

By Abeil Adilow, Emilio Barajas, Anthony Escalante, Phuc Huynh 

## Project Description

   Vaccine Tracker will be an application that checks your vaccine status based off of the information in the database. There will be two accounts Customer and Professionals, customers will have to sign up for an account and link their account and medical information through their SSN. Customers will be able to check the vaccine status of themselves or the status of someone else through scanning a QR code while being able to generate their own from the app. The professional side will be for inputting or updating customer data. We are assuming this is a government assigned program so we will have every American in as a baseline with everyone being unvaccinated and update the list when a person gets their first shot and second shot along with what type of vaccine, where they got it, when they got it, and what batch it was in. 

## MVP

   We will provide an application with a fully functional application with a frontend made with Angular, and a backend made with Java8, Spring, and Hibernate to communicate with the Database. The database will be on an AWS RDS so it can be accessed from any device so there is no version problems. The user will interact with the application through a SPA that will be dynamically altered with Angular. The customer and professional will have different login pages but customer will be able to create account while professional will not. Customer will be able to generate and get Vaccine status from QR codes. The professional will be able to update customer medical information, and get statistics from the database and show it with pie charts in the html. 

## User stories

   Customer:
	Login 
	Create account and link it with medical information
	Retrive email if forgoten with SSN for secutity
	Change password
	Get vaccine status
	Generate QR code with vaccine status
	Get other customers infomation from a QR code

   Professional:
	Login
	Update customer medical information
	Get statisics by full database or by location and will be shown in pie charts

## Tech Stack

* Frontend 
   o HTML/CSS/Bootstrap
   o Angular
   o TypeScript
* Backend
   o Java8
   o Spring
   o Hibernate/JPA
   o Swagger
* Database 
   o PostgreSQL
* Devops
   o Jenkins 
   o Git
   o Gradle
* Agile Scrum
   o Trello
* AWS
   o RDS
   o S3
   o EC2
* Testing
   o Junit 
   o Mockito
   o log4J
   o Jasmine, Karma
   o Jacoco
   o Postman

