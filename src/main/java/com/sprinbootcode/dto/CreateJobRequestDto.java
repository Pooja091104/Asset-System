package com.sprinbootcode.dto;

import jakarta.validation.constraints.NotBlank;

public record CreateJobRequestDto(@NotBlank(message = "this field is mandatory")
                                  String title,
                                  @NotBlank(message = "this field is mandatory")
                                  String description,
                                  @NotBlank(message = "this field is mandatory")
                                  String location,
                                  @NotBlank(message = "this field is mandatory")
                                  double salary) {
}
