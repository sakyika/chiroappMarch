package com.sakksoftware.com.sakksoftware.patient.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by slugz on 1/28/2017.
 */
@Data
@Document
public class FamilyHistory {

    @DBRef
    private Patient patient;

    private boolean heartDisease;

    private boolean arthritis;

    private boolean cancer;

    private boolean diabetes;

    private boolean psychoSocialDisease;

    private boolean other;

    private String otherDescription;
}
