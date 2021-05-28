package com.app.vaccine_tracker.model;

import lombok.Data;
import lombok.NoArgsConstructor;
//import org.hibernate.validator.constraints.Email;

import javax.persistence.*;


@Entity
@Table
@Data
@NoArgsConstructor
public class ProviderCredential {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "provider_id")
    private Provider provider;
    @Column(unique = true)
    private String username;
    private String password;


}
