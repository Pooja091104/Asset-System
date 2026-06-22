package com.sprinbootcode.mapper;

import com.sprinbootcode.dto.JobSeekerDto;
import com.sprinbootcode.model.JobSeeker;

public class JobSeekerMapper {

    // prevent object creation
    private JobSeekerMapper() {
    }

    public static JobSeeker mapDtoToEntity(JobSeekerDto dto) {
        JobSeeker jobSeeker = new JobSeeker();
        jobSeeker.setName(dto.name());
        jobSeeker.setResumeSummary(dto.resumeSummary());
        return jobSeeker;
    }
}