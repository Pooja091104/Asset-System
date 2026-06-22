package com.sprinbootcode.repository;

import com.sprinbootcode.model.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BookRepository extends JpaRepository<Book,Integer> {
    @Query("""
  select b 
  from Book b 
  where b.author.user.username=?1
""")
    Page<Book> getBookbyAuthor(String username, Pageable pageable);
}
