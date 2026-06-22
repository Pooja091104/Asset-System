package com.sprinbootcode.controller;

import com.sprinbootcode.dto.CreateJobRequestDto;
import com.sprinbootcode.service.JobService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/api/job")
@AllArgsConstructor
public class JobController {
    private final JobService jobService;

    @PostMapping("/PostJob")
    public void postJob(@Valid @RequestBody CreateJobRequestDto dto,
                        Principal principal){
        String employeename= principal.getName();
        jobService.postjob(dto,employeename);
    }


    @GetMapping("/getAll")
    public List<CreateJobRequestDto> getAllJobs(
            Principal principal,
            @RequestParam(defaultValue = "0", required = false) int page,
            @RequestParam(defaultValue = "10", required = false) int size) {

        String username = principal.getName();

        return jobService.getAllJobs(page, size, username);
    }

}
