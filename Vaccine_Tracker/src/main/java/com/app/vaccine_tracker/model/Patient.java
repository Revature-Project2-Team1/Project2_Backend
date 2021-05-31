package com.app.vaccine_tracker.model;

import com.fasterxml.jackson.annotation.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
@Data
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Patient {

    @Id
    @Column(name = "ssn")
    private String customerSSN;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Column(nullable = false)
    private String dob;
    @Column(name = "fullname", nullable = false)
    private String fullName;
    private String status;
    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    private Address address;
    @OneToMany(mappedBy = "patient", fetch = FetchType.LAZY)
    @JsonIgnore
    List<VaccineRecord> vaccineRecordList;
}
