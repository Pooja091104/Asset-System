package com.sprinbootcode.dto;

import java.time.LocalDate;

public record ApplicationDto(int id,
                             LocalDate appliedAt,
                             String jobTitle,
                             String companyName) {
}
