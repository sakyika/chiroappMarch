package com.sakksoftware.com.sakksoftware.patient.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

/**
 * Created by slugz on 1/28/2017.
 */
@Data
@Document
public class Patient {

    Patient(){}

    public Patient(String patientNumber, String firstName, String lastName){
        this.patientNumber = patientNumber;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    private
    @Id
    String id;

    private String patientNumber;

    private Title title;

    private String firstName;

    private String lastName;

    private Date dob;

    private String address;

    private String homePhone;

    private String workPhone;

    private String cellPhone;

    private String occupation;

    private String employer;

    private String email;

    private String hearAboutUs;

    private String emergencyContact;

    private String emergencyContactPhone;

    @DBRef
    private List<ChiropracticExperience> chiropracticExperienceList;

    @DBRef
    private FamilyHistory familyHistory;

    @DBRef
    private MedicalHistory medicalHistory;

    @DBRef
    private HealthHabit healthHabit;

    @DBRef
    private List<ChildhoodTruama> childhoodTruamaList;

    @DBRef
    private List<MotorVehicleAccident> motorVehicleAccidentList;

    @DBRef
    private List<HomeAccident> homeAccidentList;

    @DBRef
    private List<SportsAccident> sportsAccidentList;

    @DBRef
    private List<WorkAccident> workAccidentList;

    @DBRef
    private List<Complaint> complaintList;

    @DBRef
    private List<Diagnosis> diagnosisList;

    @DBRef
    private List<SoapNote> soapNoteList;

}