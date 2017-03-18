package com.sakksoftware.com.sakksoftware.patient.repository;

import com.sakksoftware.com.sakksoftware.patient.model.MotorVehicleAccident;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by slugz on 1/29/2017.
 */
public interface MotorVehicleAccidentRepository extends MongoRepository<MotorVehicleAccident, String> {
}
