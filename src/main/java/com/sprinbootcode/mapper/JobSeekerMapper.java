package com.sprinbootcode.mapper;

import com.sprinbootcode.dto.JobSeekerDto;
import com.sprinbootcode.model.JobSeeker;
import org.springframework.stereotype.Component;

@Component

public class JobSeekerMapper {
    public static JobSeeker MapDtoEntity(JobSeekerDto dto){
        JobSeeker jobSeeker=new JobSeeker();
        jobSeeker.setName(dto.name());
        jobSeeker.setResumeSummary(dto.resumeSummary());
        return jobSeeker;
    }
}
