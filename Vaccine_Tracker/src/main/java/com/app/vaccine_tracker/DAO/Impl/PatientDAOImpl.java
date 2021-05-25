package com.app.vaccine_tracker.dao.impl;

import com.app.vaccine_tracker.dao.PatientDAO;
import com.app.vaccine_tracker.model.Patient;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

public class PatientDAOImpl implements PatientDAO {

    private JdbcTemplate template;
    private DataSource dataSource;

    public void setDataSource(DataSource dataSource){
        this.dataSource=dataSource;
        this.template=new JdbcTemplate(this.dataSource);
    }

    @Override
    public Patient addPatient(Patient patient) {
        return null;
    }
}
