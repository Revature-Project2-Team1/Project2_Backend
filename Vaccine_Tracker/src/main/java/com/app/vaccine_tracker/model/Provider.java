package com.app.vaccine_tracker.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table
@Data
@NoArgsConstructor
public class Provider {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int providerId;
    @OneToMany(mappedBy = "provider", fetch = FetchType.LAZY)
    private List<Clinic> clinicList;
    @Column(name ="provider_name")
    private String providerFullName;
    @Column(name = "provider_email", unique = true)
    private String  providerEmail;


}