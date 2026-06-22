package com.sprinbootcode.repository;

import com.sprinbootcode.model.Employer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployerRepository extends JpaRepository<Employer,Integer> {


    Employer findByUserUsername(String employeename);
}
