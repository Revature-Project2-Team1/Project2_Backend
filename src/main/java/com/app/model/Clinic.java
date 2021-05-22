package com.app.model;

public class Clinic {
    private int clinicId;
    private String clinicSite;
    private Address clinicSiteAddress;

    public Clinic() {
    }

    public int getClinicId() {
        return clinicId;
    }

    public void setClinicId(int clinicId) {
        this.clinicId = clinicId;
    }

    public String getClinicSite() {
        return clinicSite;
    }

    public void setClinicSite(String clinicSite) {
        this.clinicSite = clinicSite;
    }

    public Address getClinicSiteAddress() {
        return clinicSiteAddress;
    }

    public void setClinicSiteAddress(Address clinicSiteAddress) {
        this.clinicSiteAddress = clinicSiteAddress;
    }
}
