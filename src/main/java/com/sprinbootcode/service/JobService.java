package com.sprinbootcode.service;

import com.sprinbootcode.dto.CreateJobRequestDto;
import com.sprinbootcode.mapper.JobMapper;
import com.sprinbootcode.model.Employer;
import com.sprinbootcode.model.Job;
import com.sprinbootcode.repository.JobRepository;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class JobService {
    private final EmployerService employerService;
    private final JobRepository jobRepository;

    public void postjob(@Valid CreateJobRequestDto dto, String employeename) {
        Job job= JobMapper.MapDtoToEntity(dto);
        Employer employer=employerService.getByUsername(employeename);
        job.setEmployer(employer);
        jobRepository.save(job);
    }

    public List<CreateJobRequestDto> getAllJobs(int page, int size, String username) {
        Pageable pageable= PageRequest.of(page,size);
        return jobRepository.findAll(pageable)
                .stream()
                .map(JobMapper::MapEntityToDto)
                .toList();
    }
}
