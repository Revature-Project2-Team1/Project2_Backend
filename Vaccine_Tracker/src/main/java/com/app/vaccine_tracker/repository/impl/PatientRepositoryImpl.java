
package com.app.vaccine_tracker.repository.impl;

import com.app.vaccine_tracker.model.Patient;
import com.app.vaccine_tracker.repository.PatientRepository;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

public class PatientRepositoryImpl implements PatientRepository {

    private JdbcTemplate template;
    private DataSource dataSource;

    public void setDataSource(DataSource dataSource){
        this.dataSource=dataSource;
        this.template=new JdbcTemplate(this.dataSource);
    }

    //@Override
    //public Patient addPatient(Patient patient) {
        //return null;
   // }
}