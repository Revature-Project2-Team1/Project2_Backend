package com.app.dao;

public interface ProfessionalDAO {
    public void updateConsumerInfo();
    public void getStatistics();
    public void getStatistics(String loc,String loctype);
    public void getListofConsumers(String value, String listType);
}
