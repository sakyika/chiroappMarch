package com.sakksoftware.com.sakksoftware.patient.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * Created by slugz on 1/28/2017.
 */
@Data
@Document
public class ChiropracticExperience {

    @DBRef
    private Patient patient;

    private String previousChiropractorName;

    private String previousChiropractorLocation;

    private String previousChiropractorPhone;

    private Date lastChiropractorVisit;

    private boolean xRayTaken;
}
