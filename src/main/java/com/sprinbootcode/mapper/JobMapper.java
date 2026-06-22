package com.sprinbootcode.mapper;

import com.sprinbootcode.dto.CreateJobRequestDto;
import com.sprinbootcode.model.Job;

public class JobMapper {
    public static Job MapDtoToEntity(CreateJobRequestDto dto){
        Job job=new Job();
        job.setTitle(dto.title());
        job.setDescription(dto.description());
        job.setLocation(dto.location());
        job.setSalary(dto.salary());
        return job;
    }
    public static CreateJobRequestDto MapEntityToDto(Job job) {
        return new CreateJobRequestDto(
                job.getTitle(),
                job.getDescription(),
                job.getLocation(),
                job.getSalary()
        );
    }
}
