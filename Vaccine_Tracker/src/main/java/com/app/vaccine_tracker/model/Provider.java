package com.app.vaccine_tracker.model;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;


@Entity
@Table
@Data
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Provider {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int providerId;
    @OneToMany(mappedBy = "provider", fetch = FetchType.LAZY)
    @JsonIgnore
    private List<Clinic> clinicList;
    @Column(name ="provider_name")
    private String providerFullName;
    @Column(name = "provider_email", unique = true)
    private String  providerEmail;
}