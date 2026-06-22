package com.sprinbootcode.mapper;

import com.sprinbootcode.dto.ApplicationDto;
import com.sprinbootcode.model.Application;
import org.springframework.stereotype.Component;

@Component
public class ApplicationMapper {
    public static ApplicationDto MapEntityToDto(Application application){
        return new ApplicationDto(application.getId(),
                application.getAppliedAt(),
                application.getJob().getTitle(),
                application.getJob().getEmployer().getCompanyName());
    }
}
