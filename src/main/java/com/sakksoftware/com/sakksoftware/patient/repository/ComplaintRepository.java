package com.sakksoftware.com.sakksoftware.patient.repository;

import com.sakksoftware.com.sakksoftware.patient.model.Complaint;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by slugz on 1/29/2017.
 */
public interface ComplaintRepository extends MongoRepository<Complaint, String> {
}
