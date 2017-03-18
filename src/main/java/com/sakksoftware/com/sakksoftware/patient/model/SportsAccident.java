package com.sakksoftware.com.sakksoftware.patient.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * Created by slugz on 1/29/2017.
 */
@Data
@Document
public class SportsAccident {

    @DBRef
    private Patient patient;

    private boolean sportsAccident;

    private Date accidentDate;

    private String bodyPartsInjured;

    private boolean injuriesResolved;

    private String briefAccount;

    private boolean medicalCareReceived;

    private String careGivenByDoctor;

    private String careTypeGiven;

}
