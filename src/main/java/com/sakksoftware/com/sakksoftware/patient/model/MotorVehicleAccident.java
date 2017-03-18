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
public class MotorVehicleAccident {

    @DBRef
    private Patient patient;

    private boolean motorVehicleAccident;

    private Date accidentDate;

    private DriverPassenger driverOrPassenger;

    private boolean wearingSeatBelt;

    private VehicleCollisionPart vehicleCollisionPart;

    private boolean strikeHead;

    private boolean lossConsciousness;

    private boolean sentToHospital;

    private boolean xrayTaken;

    private boolean medicationGiven;

    private String careGivenType;

    private String careGivenByDoctor;

    private String injuriesSustained;

    private boolean injuriesResolved;

}
