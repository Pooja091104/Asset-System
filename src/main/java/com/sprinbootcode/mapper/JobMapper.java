package com.sprinbootcode.mapper;

import com.sprinbootcode.dto.CreateJobRequestDto;
import com.sprinbootcode.model.Job;

public class JobMapper {

    // prevent instantiation
    private JobMapper() {
    }

    public static Job mapDtoToEntity(CreateJobRequestDto dto) {
        Job job = new Job();
        job.setTitle(dto.title());
        job.setDescription(dto.description());
        job.setLocation(dto.location());
        job.setSalary(dto.salary());
        return job;
    }

    public static CreateJobRequestDto mapEntityToDto(Job job) {
        return new CreateJobRequestDto(
                job.getTitle(),
                job.getDescription(),
                job.getLocation(),
                job.getSalary()
        );
    }
}