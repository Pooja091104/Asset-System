package com.sprinbootcode.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record EmployerDto(@NotBlank(message = "name is mandatory")
                          String companyName,
                          @NotBlank(message = "usenname is mandatory")
                          String username,
                          @NotBlank(message = "password is mandatory")
                          String password) {
}
