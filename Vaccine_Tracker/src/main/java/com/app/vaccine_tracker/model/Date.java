package com.app.vaccine_tracker.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;

@Entity
@Table
@NoArgsConstructor
@ToString
@Data
public class Date {

@Id
@Column(name = "date_id")
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int dateId;

@DateTimeFormat(pattern = "dd/MM/yyyy")
private String date;
}

