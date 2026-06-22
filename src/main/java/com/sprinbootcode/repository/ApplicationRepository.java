package com.sprinbootcode.repository;

import com.sprinbootcode.model.Application;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationRepository extends JpaRepository<Application,Integer> {
    Page<Application> findByJobSeekerUserUsername(String username, Pageable pageable);
}
