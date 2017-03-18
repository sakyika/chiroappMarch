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
public class SoapNote {

    @DBRef
    private Patient patient;

    private Diagnosis diagnosis;

    private Date visitDate;

    private Long visitNumber;

    private Progress progress;

    private String reportedPain;

    private String functionalTestBeforeTreatment;

    private String functionalTestAfterTreatment;

    private boolean objectiveMP;

    private boolean objectiveSP;

    private boolean objectiveC0;

    private boolean objectiveC1;

    private boolean objectiveC2;

    private boolean objectiveC3;

    private boolean objectiveC4;

    private boolean objectiveC5;

    private boolean objectiveC6;

    private boolean objectiveC7;

    private boolean objectiveT1;

    private boolean objectiveT2;

    private boolean objectiveT3;

    private boolean objectiveT4;

    private boolean objectiveT5;

    private boolean objectiveT6;

    private boolean objectiveT7;

    private boolean objectiveT8;

    private boolean objectiveT9;

    private boolean objectiveT10;

    private boolean objectiveT11;

    private boolean objectiveT12;

    private boolean objectiveL1;

    private boolean objectiveL2;

    private boolean objectiveL3;

    private boolean objectiveL4;

    private boolean objectiveL5;

    private boolean objectiveS1;

    private boolean tT;

    private boolean subocc;

    private boolean csPSP;

    private boolean tSPSP;

    private boolean lSPSP;

    private boolean trapezius;

    private boolean levScap;

    private boolean rhomboids;

    private boolean pectoralisMajor;

    private boolean pectoralisMinor;

    private boolean shoulderRotators;

    private String shoulderRotatorsDescription;

    private boolean wristExtensors;

    private boolean wristFlexors;

    private boolean qL;

    private boolean glutMed;

    private boolean glutMax;

    private boolean piriformis;

    private boolean psoas;

    private boolean hamstrings;

    private boolean quads;

    private boolean gastrocs;

    private boolean tibAnt;

    private boolean fibularisGr;

    private boolean plantarFascia;

    private String tTOther;

    private boolean pOMAdj;

    private boolean pOMMOB;

    private boolean pOMC0;

    private boolean pOMC1;

    private boolean pOMC2;

    private boolean pOMC3;

    private boolean pOMC4;

    private boolean pOMC5;

    private boolean pOMC6;

    private boolean pOMC7;

    private boolean pOMT1;

    private boolean pOMT2;

    private boolean pOMT3;

    private boolean pOMT4;

    private boolean pOMT5;

    private boolean pOMT6;

    private boolean pOMT7;

    private boolean pOMT8;

    private boolean pOMT9;

    private boolean pOMT10;

    private boolean pOMT11;

    private boolean pOMT12;

    private boolean pOMS1;

    private boolean sTT;

    private boolean mRT;

    private boolean pNF;

    private boolean thpr;

    private boolean heat;

    private boolean ice;

    private boolean tens;

    private String tensIntensity;

    private String tensPads;

    private String tensDuratoin;

    private boolean otherModalities;

    private String otherModalitiesDescription;

    private String acupuncturePoints;

    private String rehabProtocol;

}
