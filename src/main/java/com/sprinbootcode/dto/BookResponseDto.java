package com.sprinbootcode.dto;

public record BookResponseDto(int bookid,
                              String title,
                              String authorName,
                              String authorEmail) {
}
