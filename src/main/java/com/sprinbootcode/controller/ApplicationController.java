package com.sprinbootcode.controller;

import com.sprinbootcode.dto.ApplicationDto;

import com.sprinbootcode.service.ApplicationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/api/application")
@AllArgsConstructor
public class ApplicationController {
    private final ApplicationService applicationService;

    @GetMapping("/view")
    public List<ApplicationDto> getMyApplication(Principal principal, @RequestParam(defaultValue = "0",required = false)int page,
                                                 @RequestParam(defaultValue = "10",required = false)int size){
        String username= principal.getName();
        return applicationService.getMyApplication(username,page,size);
    }


    @PostMapping("/apply/{jobId}")
    public void apply(@PathVariable int jobId, Principal principal){
        String username = principal.getName();
        applicationService.apply(jobId, username);
    }
}
