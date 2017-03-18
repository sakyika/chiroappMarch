package com.sakksoftware.com.sakksoftware.patient.repository;

import com.sakksoftware.com.sakksoftware.patient.model.Diagnosis;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by slugz on 1/29/2017.
 */
public interface DiagnosisRepository extends MongoRepository<Diagnosis, String> {
}
