package com.sprinbootcode.controller;

import com.sprinbootcode.dto.BookResponseDto;
import com.sprinbootcode.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/api/Book")
@AllArgsConstructor
public class BookController {
    private final BookService bookService;

    @GetMapping("/get")
    public List<BookResponseDto> getBook(Principal principal,
                                         @RequestParam(defaultValue = "0",required = false)int page,
                                         @RequestParam(defaultValue = "0",required = false)int size){
        String username= principal.getName();
        return bookService.getBook(username,page,size);
    }
}
