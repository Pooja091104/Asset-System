package com.sprinbootcode.service;

import com.sprinbootcode.dto.BookResponseDto;
import com.sprinbootcode.mapper.BookMapper;
import com.sprinbootcode.model.Book;
import com.sprinbootcode.repository.BookRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BookService {
    private final BookRepository bookRepository;

    public List<BookResponseDto> getBook(String username, int page, int size) {
        Pageable pageable=PageRequest.of(page,size);
        List<Book> list=bookRepository.getBookbyAuthor(username,pageable).getContent();
        return list
                .stream()
                .map(BookMapper::mapEntityToDto)
                .toList();
    }
}
