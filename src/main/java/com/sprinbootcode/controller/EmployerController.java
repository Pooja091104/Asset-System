package com.sprinbootcode.controller;

import com.sprinbootcode.dto.EmployerDto;
import com.sprinbootcode.dto.JobSeekerDto;
import com.sprinbootcode.service.EmployerService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/Employer")
@AllArgsConstructor
public class EmployerController {
    private final EmployerService employerService;

    @PostMapping("/Signup")
    public void add(@Valid @RequestBody EmployerDto dto){

        employerService.add(dto);
    }

}
