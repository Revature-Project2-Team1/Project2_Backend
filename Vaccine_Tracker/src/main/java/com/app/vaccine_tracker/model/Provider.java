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
public class Provider{

    @Id
    @Column(name = "provider_email")
    private String  providerEmail;
    @OneToMany(mappedBy = "provider")
    private List<Clinic> clinicList = new ArrayList<>();
    @ManyToOne
    User user = new User();
}
