package com.app.model;

import java.util.List;

public class Professional extends User{
    private List<Clinic> clinics;
    //private int userId;
    private int profId;

    public Professional() {
    }

    public int getProfId() {
        return profId;
    }

    public void setProfId(int profId) {
        this.profId = profId;
    }

    public List<Clinic> getClinics() {
        return clinics;
    }

    public void setClinics(List<Clinic> clinics) {
        this.clinics = clinics;
    }

    @Override
    public String toString() {
        return "Professional{" +
                "clinics=" + clinics +
                ", profId=" + profId +
                '}';
    }
}
