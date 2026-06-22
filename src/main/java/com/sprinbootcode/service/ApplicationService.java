package com.sprinbootcode.service;

import com.sprinbootcode.dto.ApplicationDto;
import com.sprinbootcode.dto.ApplicationReqDto;
import com.sprinbootcode.mapper.ApplicationMapper;
import com.sprinbootcode.model.Application;
import com.sprinbootcode.model.Job;
import com.sprinbootcode.model.JobSeeker;
import com.sprinbootcode.repository.ApplicationRepository;
import com.sprinbootcode.repository.JobRepository;
import com.sprinbootcode.repository.JobSeekerRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ApplicationService {
    private final ApplicationRepository applicationRepository;
    private final JobSeekerRepository jobSeekerRepository;
    private final JobRepository jobRepository;

    public List<ApplicationDto> getMyApplication(String username, int page, int size) {
        Pageable pageable= PageRequest.of(page,size);
        List<Application> list=applicationRepository.findByJobSeekerUserUsername(username,pageable).getContent();
        return list.stream()
                .map(ApplicationMapper::mapEntityToDto)
                .toList();
    }

    public void apply(int jobId, String username) {
        JobSeeker jobSeeker = jobSeekerRepository
                    .findByUserUsername(username)
                    .orElseThrow(() -> new RuntimeException("Job Seeker not found"));
            Job job = jobRepository.findById(jobId)
                    .orElseThrow(() -> new RuntimeException("Job not found"));

            // Step 3: Create Application
            Application application = new Application();


            application.setJobSeeker(jobSeeker);
            application.setJob(job);


            applicationRepository.save(application);
        }
    }

