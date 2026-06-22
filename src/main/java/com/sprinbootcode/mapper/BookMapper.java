package com.sprinbootcode.mapper;

import com.sprinbootcode.dto.BookResponseDto;
import com.sprinbootcode.model.Book;

public class BookMapper {
    public static BookResponseDto MapEntityToDto(Book book){
        return new BookResponseDto(book.getId(),
                book.getTitle(),
                book.getAuthor().getName(),
                book.getAuthor().getEmail());
    }
}
