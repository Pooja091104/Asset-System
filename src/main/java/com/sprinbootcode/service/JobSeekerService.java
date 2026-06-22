package com.sprinbootcode.service;

import com.sprinbootcode.dto.JobSeekerDto;
import com.sprinbootcode.enums.Role;
import com.sprinbootcode.mapper.JobSeekerMapper;
import com.sprinbootcode.mapper.UserMapper;
import com.sprinbootcode.model.JobSeeker;
import com.sprinbootcode.model.User;
import com.sprinbootcode.repository.JobSeekerRepository;
import com.sprinbootcode.repository.UserRepository;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class JobSeekerService {
    private final PasswordEncoder passwordEncoder;
    private final UserRepository userRepository;
    private final UserService userService;
    private final JobSeekerRepository jobSeekerRepository;

    public void add(@Valid JobSeekerDto dto) {
        JobSeeker jobSeeker= JobSeekerMapper.mapDtoToEntity(dto);
        User user= UserMapper.mapJobSeekerDtoToEntity(dto);
        user.setRole(Role.SEEKER);
        user.setPassword(passwordEncoder.encode(dto.password()));
        user=userService.save(user);
        jobSeeker.setUser(user);
        jobSeekerRepository.save(jobSeeker);


    }
}
