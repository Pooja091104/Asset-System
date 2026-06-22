package com.sprinbootcode.service;

import com.sprinbootcode.dto.EmployerDto;
import com.sprinbootcode.enums.Role;
import com.sprinbootcode.mapper.EmployeMapper;
import com.sprinbootcode.mapper.JobSeekerMapper;
import com.sprinbootcode.mapper.UserMapper;
import com.sprinbootcode.model.Employer;
import com.sprinbootcode.model.JobSeeker;
import com.sprinbootcode.model.User;
import com.sprinbootcode.repository.EmployerRepository;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployerService {
    private final PasswordEncoder passwordEncoder;
    private final UserService userService;
    private final EmployerRepository employerRepository;

    public void add(@Valid EmployerDto dto) {
        Employer employer= EmployeMapper.MapDtoToEntity(dto);
        User user= UserMapper.MapDtoToEntity(dto);
        user.setRole(Role.EMPLOYER);
        user.setPassword(passwordEncoder.encode(dto.password()));
        user=userService.save(user);
        employer.setUser(user);
        employerRepository.save(employer);
    }

    public Employer getByUsername(String employeename) {
        return employerRepository.findByUserUsername(employeename);
    }
}
