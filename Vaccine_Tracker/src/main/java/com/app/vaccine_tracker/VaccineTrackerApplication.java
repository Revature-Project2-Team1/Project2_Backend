package com.app.vaccine_tracker;

import com.app.vaccine_tracker.dao.PatientDAO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@SpringBootApplication
public class VaccineTrackerApplication {

    public static void main(String[] args) {

        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        PatientDAO dao=(PatientDAO) context.getBean("DAO");
        SpringApplication.run(VaccineTrackerApplication.class, args);

    }

}
