package com.sakksoftware.com.sakksoftware.patient.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

/**
 * Created by slugz on 1/29/2017.
 */
@Data
@Document
public class Complaint {

    @DBRef
    private Patient patient;

    @DBRef
    private List<Diagnosis> diagnosisList;

    private boolean sharp;

    private boolean dull;

    private boolean throbbing;

    private boolean aching;

    private boolean burning;

    private boolean stabbing;

    private boolean weakness;

    private boolean numbness;

    private boolean tingling;

    private boolean other;

    private String otherDescription;

    private String location;

    private Date complaintDate;

    private Date startDate;

    private boolean previousOccurance;

    private Date previousOccuranceDate;

    private String howItHappened;

    private String whatMakesWorst;

    private String whatMakesBetter;

    private boolean painRadiates;

    private String painRadiatesWhere;

    private PainPattern painPattern;

    private PainScale painScale;

    private TimeOfDay painWorst;

}
