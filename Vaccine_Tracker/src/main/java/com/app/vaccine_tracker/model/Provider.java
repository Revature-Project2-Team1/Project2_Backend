package com.app.vaccine_tracker.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
@Data
@NoArgsConstructor
@ToString
public class Provider extends User {

<<<<<<< HEAD
    @Column(name = "provider_email")
    private String  providerEmail;

=======
>>>>>>> 4b2b232b763971a4c01a8da1d4d6969bc30010fe
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "provider_id")
    private int providerId;
<<<<<<< HEAD

    @OneToMany(mappedBy = "provider")
    private List<Clinic> clinicList = new ArrayList<>();

=======
    @OneToMany
    @JoinColumn(name = "clinic_id")
    private Clinic clinic;
>>>>>>> 4b2b232b763971a4c01a8da1d4d6969bc30010fe
}
