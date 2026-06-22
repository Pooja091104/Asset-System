package com.sprinbootcode.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record JobSeekerDto(@NotBlank(message = "name is mandatory")
                           String name,
                           String resumeSummary,
                           @NotBlank
                           String username,
                           @NotBlank
                           String password) {
}
