package com.sprinbootcode.repository;

import com.sprinbootcode.model.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<Job,Integer> {
}
