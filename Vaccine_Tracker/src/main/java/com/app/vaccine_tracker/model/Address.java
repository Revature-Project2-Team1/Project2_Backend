package com.app.vaccine_tracker.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table
@Data
@NoArgsConstructor
public class Address {

    @Id
    @Column(name = "address_id")
    private int addressId;

    @Column(name = "street")
    private String Street;

    @Column(name = "city")
    private String city;

    @Column(name = "state")
    private String state;

    @Column(name = "zip")
    private int zip;

}
