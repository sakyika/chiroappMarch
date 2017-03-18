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
public class WorkAccident {

    @DBRef
    private Patient patient;

    private boolean workAccident;

    private Date accidentDate;

    private String employer;

    private boolean wsibClaim;

    private boolean disability;

    private String permanentOrPartialDisability;

    private String bodyPartsInjured;

    private boolean xrayTaken;

    private String briefAccount;

    private boolean medicalCareReceived;

    private String careGivenByDoctor;

    private String careGivenType;

    private String injuriesSustained;

    private boolean injuriesResolved;

}


