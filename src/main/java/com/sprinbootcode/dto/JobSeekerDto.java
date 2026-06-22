package com.sprinbootcode.dto;

import jakarta.validation.constraints.NotBlank;


public record JobSeekerDto(@NotBlank(message = "name is mandatory")
                           String name,
                           String resumeSummary,
                           @NotBlank
                           String username,
                           @NotBlank
                           String password) {
}
