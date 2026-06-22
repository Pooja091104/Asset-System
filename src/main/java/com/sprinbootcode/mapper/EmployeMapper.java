package com.sprinbootcode.mapper;

import com.sprinbootcode.dto.EmployerDto;
import com.sprinbootcode.model.Employer;

public class EmployeMapper {

    // prevent object creation
    private EmployeMapper() {
    }

    public static Employer mapDtoToEntity(EmployerDto dto) {
        Employer employer = new Employer();
        employer.setCompanyName(dto.companyName());
        return employer;
    }
}