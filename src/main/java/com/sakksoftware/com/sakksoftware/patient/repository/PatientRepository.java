package com.sakksoftware.com.sakksoftware.patient.repository;

import com.sakksoftware.com.sakksoftware.patient.model.Patient;
import org.springframework.data.mongodb.repository.MongoRepository;

import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by slugz on 1/28/2017.
 */
public interface PatientRepository extends MongoRepository<Patient, String> {

    List<Patient> findByLastName(@Param("name") String name);

}
