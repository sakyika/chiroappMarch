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
public class HealthHabit {

    @DBRef
    private Patient patient;

    private String familyDoctorName;

    private String familyDoctorPhone;

    private String familyDoctoryAddress;

    private Date lastFullCheckUp;

    private boolean onMedication;

    private String medicationType1;

    private String medicationType1For;

    private String medicationType1Dose;

    private String medicationType1Frequency;

    private String medicationType2;

    private String medicationType2For;

    private String medicationType2Dose;

    private String medicationType2Frequency;

    private String surgery1;

    private Date surgery1Date;

    private boolean surgery1Complications;

    private String surgery2;

    private Date surgery2Date;

    private boolean surgery2Complications;

    private boolean vision;

    private boolean hearing;

    private boolean smell;

    private boolean taste;

    private boolean dizziness;

    private boolean headaches;

    private boolean difficultySwallowing;

    private boolean lossOfBalance;

    private boolean nightSweats;

    private boolean diabetes;

    private boolean stroke;

    private boolean aneurysm;

    private boolean heartContition;

    private boolean osteoprosis;

    private boolean arthritis;

    private boolean prostateDisorder;

    private boolean menstrualProblems;

    private boolean hepatitis;

    private boolean hivInfected;

    private boolean shortnessOfBreath;

    private boolean cancer;

    private boolean std;

    private boolean tuberculosis;

    private boolean chestPain;

    private boolean highBloodPressure;

    private boolean digestiveProblems;

    private boolean bowlProblems;

    private boolean bladderProblems;

    private boolean significantWeightLoss;

    private boolean pinsAndNeedlesInArm;

    private boolean numbnessInFingers;

    private boolean weaknessInFingers;

    private boolean numblessInLegs;

    private boolean weaknessInLegs;

    private boolean backPain;

    private boolean neckPain;

    private boolean tmjDisorder;

    private boolean earRinging;

    private boolean other;

    private String otherDescription;

    private Pregnancy pregnancy;

    private Date lastMenstrualPeriod;

    private boolean allowedToContactMedicalDoctor;

}
