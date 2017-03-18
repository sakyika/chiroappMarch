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
public class Diagnosis {

    @DBRef
    private Patient patient;

    @DBRef
    private Complaint complaint;

    @DBRef
    private List<SoapNote> soapNoteList;

    private Date visitDate;

    private boolean hA;

    private boolean mechNP;

    private boolean discogenicNP;

    private boolean mechUBP;

    private boolean mechMBP;

    private boolean mechLBP;

    private boolean discogenicLBP;

    private boolean siJoinIrritation;

    private boolean sciatica;

    private boolean dddNDjd;

    private boolean mfpsOf;

    private String mfpsOfDescription;

    private boolean cTS;

    private boolean bicipitalTendinopathy;

    private boolean frozenShoulder;

    private boolean rotatorCuffTendonitis;

    private boolean shoulderImpingment;

    private boolean medicalEpicondylitis;

    private boolean lateralEpicondylitis;

    private boolean hipOA;

    private boolean kneeOA;

    private boolean itbSyndrome;

    private boolean pFPS;

    private boolean pesAnserineBursitis;

    private boolean plantarFasciitis;

    private boolean repetitiveStrainOf;

    private String repetitiveStrainOfDescription;

    private String diagnosisOther;

    private boolean sMT;

    private boolean mobs;

    private boolean sttMrt;

    private boolean sttPnf;

    private boolean exercise;

    private boolean acupuncture;

    private boolean orthodics;

    private boolean modalities;

    private String pomOther;

    private String treatmentPlan;

}
