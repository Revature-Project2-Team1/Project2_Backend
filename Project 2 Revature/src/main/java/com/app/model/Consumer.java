package com.app.model;

import java.util.Date;
import java.util.List;

public class Consumer extends User {
    private String status;
    private String vaccineType;
    private String SSN;
    private String lot;
    private List<Date> vaccineDates;
    //private int userId;
    private Date dob;
    private int pc;
    private Address address;

    public Consumer() {
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getVaccineType() {
        return vaccineType;
    }

    public void setVaccineType(String vaccineType) {
        this.vaccineType = vaccineType;
    }

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public String getLot() {
        return lot;
    }

    public void setLot(String lot) {
        this.lot = lot;
    }

    public List<Date> getVaccineDates() {
        return vaccineDates;
    }

    public void setVaccineDates(List<Date> vaccineDates) {
        this.vaccineDates = vaccineDates;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public int getPc() {
        return pc;
    }

    public void setPc(int pc) {
        this.pc = pc;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Consumer{" +
                "status='" + status + '\'' +
                ", vaccineType='" + vaccineType + '\'' +
                ", SSN='" + SSN + '\'' +
                ", lot='" + lot + '\'' +
                ", vaccineDates=" + vaccineDates +
                ", dob=" + dob +
                ", pc=" + pc +
                '}';
    }
}
