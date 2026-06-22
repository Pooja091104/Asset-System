package com.sprinbootcode.mapper;

import com.sprinbootcode.dto.BookResponseDto;
import com.sprinbootcode.model.Book;

public class BookMapper {

    // prevent object creation
    private BookMapper() {
    }

    public static BookResponseDto mapEntityToDto(Book book) {
        return new BookResponseDto(
                book.getId(),
                book.getTitle(),
                book.getAuthor().getName(),
                book.getAuthor().getEmail()
        );
    }
}