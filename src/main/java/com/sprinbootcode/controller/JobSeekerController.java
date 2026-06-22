package com.sprinbootcode.controller;

import com.sprinbootcode.dto.JobSeekerDto;
import com.sprinbootcode.service.JobSeekerService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/JobSeeker")
@AllArgsConstructor
public class JobSeekerController {
    private final JobSeekerService jobSeekerService;

    @PostMapping("/Signup")
    public void add(@Valid @RequestBody JobSeekerDto dto){
        jobSeekerService.add(dto);
    }

}
