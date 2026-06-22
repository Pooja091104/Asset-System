package com.sprinbootcode.mapper;

import com.sprinbootcode.dto.EmployerDto;
import com.sprinbootcode.dto.JobSeekerDto;
import com.sprinbootcode.model.User;

public class UserMapper {
    public static User MapDtoToEntity(JobSeekerDto dto){
        User user = new User();
        user.setUsername(dto.username());
        user.setPassword(dto.password());
        return user;
    }
    public static User MapDtoToEntity(EmployerDto dto){
        User user = new User();
        user.setUsername(dto.username());
        user.setPassword(dto.password());
        return user;
    }
}
