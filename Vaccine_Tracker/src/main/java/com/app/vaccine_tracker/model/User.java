package com.app.vaccine_tracker.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.validator.constraints.Email;
import sun.security.jca.ProviderList;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
@Data
@NoArgsConstructor
@ToString
public class User {

    @Id
    @Email(message = "Invalid email")
<<<<<<< HEAD
    private String email;
=======

    private String email;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "provider_email")
    private Provider provider;
>>>>>>> 4b2b232b763971a4c01a8da1d4d6969bc30010fe
    @Column(name ="fullname", nullable = false)
    private String fullName;
    @Column(nullable = false)
    private  String password;
    @Column(unique = true, nullable = false)
    private String ssn;

    @OneToOne
    @JoinColumn(name ="provider_email")
    private  Provider provider;

    @OneToOne
    @JoinColumn(name = "patient_ssn")
    private Patient patient;


}
