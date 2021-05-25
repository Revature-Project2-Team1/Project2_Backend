package com.app.vaccine_tracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@SpringBootApplication
public class VaccineTrackerApplication {

    public static void main(String[] args) {
        SpringApplication.run(VaccineTrackerApplication.class, args);


    }

}
