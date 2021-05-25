package com.app.vaccine_tracker.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table
@Data
@NoArgsConstructor
@ToString
public class Customer extends User {

    @Id
    @Column(name = "customer_ssn")
    private String customerSSN;

    private String status;
    @Column(name = "vaccine_type")
    private String vaccineType;
    private String dob;
    private String lot;
    @ManyToOne
    @JoinColumn(name = "address_id")
    private Address address;
}