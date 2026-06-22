package com.sprinbootcode.mapper;

import com.sprinbootcode.dto.EmployerDto;
import com.sprinbootcode.dto.JobSeekerDto;
import com.sprinbootcode.model.User;

public class UserMapper {

    // prevent instantiation
    private UserMapper() {
    }

    public static User mapJobSeekerDtoToEntity(JobSeekerDto dto) {
        User user = new User();
        user.setUsername(dto.username());
        user.setPassword(dto.password());
        return user;
    }

    public static User mapEmployerDtoToEntity(EmployerDto dto) {
        User user = new User();
        user.setUsername(dto.username());
        user.setPassword(dto.password());
        return user;
    }
}