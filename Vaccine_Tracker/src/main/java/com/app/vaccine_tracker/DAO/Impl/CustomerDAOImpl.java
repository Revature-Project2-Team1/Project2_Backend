package com.app.vaccine_tracker.DAO.Impl;

import com.app.vaccine_tracker.DAO.CustomerDAO;
import com.app.vaccine_tracker.model.Patient;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

public class CustomerDAOImpl implements CustomerDAO {

    private JdbcTemplate template;
    private DataSource dataSource;

    public void setDataSource(DataSource dataSource){
        this.dataSource=dataSource;
        this.template=new JdbcTemplate(this.dataSource);
    }

    @Override
    public Patient addCustomer(Patient patient) {
        String sql = "";
        return null;
    }

}
