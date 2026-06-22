package com.sprinbootcode.mapper;

import com.sprinbootcode.dto.EmployerDto;
import com.sprinbootcode.model.Employer;

public class EmployeMapper {
    public static Employer MapDtoToEntity(EmployerDto dto){
        Employer employer=new Employer();
        employer.setCompanyName(dto.companyName());
        return employer;
    }
}
