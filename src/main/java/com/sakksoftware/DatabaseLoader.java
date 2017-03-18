package com.sakksoftware;

import com.sakksoftware.com.sakksoftware.patient.model.Patient;
import com.sakksoftware.com.sakksoftware.patient.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by slugz on 1/28/2017.
 */
@Component
public class DatabaseLoader implements CommandLineRunner {

    private final PatientRepository repository;

    @Autowired
    public DatabaseLoader(PatientRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... strings) throws Exception {
        this.repository.save(new Patient("544", "Kwadwo", "Sakyi" ));
        this.repository.save(new Patient("422", "Juliet", "Brown" ));
    }
}
