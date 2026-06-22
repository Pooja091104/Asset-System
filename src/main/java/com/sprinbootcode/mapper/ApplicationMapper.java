package com.sprinbootcode.mapper;

import com.sprinbootcode.dto.ApplicationDto;
import com.sprinbootcode.model.Application;

public class ApplicationMapper {

    // private constructor to prevent object creation
    private ApplicationMapper() {
    }

    public static ApplicationDto mapEntityToDto(Application application) {
        return new ApplicationDto(
                application.getId(),
                application.getAppliedAt(),
                application.getJob().getTitle(),
                application.getJob().getEmployer().getCompanyName()
        );
    }
}