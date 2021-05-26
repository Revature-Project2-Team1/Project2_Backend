package com.app.vaccine_tracker.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
public class PieChart {
    private  float totalNumberOfPatient;
    private  float unvaccinatedNum;
    private  float fullyVaccinaedNum;
    private  float partialVaccinatedNum;
}
