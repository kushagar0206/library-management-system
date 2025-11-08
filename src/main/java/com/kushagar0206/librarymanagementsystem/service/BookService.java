package com.kushagar0206.librarymanagementsystem.service;

import com.kushagar0206.librarymanagementsystem.dto.BookDTO;
import java.util.List;

public interface BookService {

    public BookDTO addBook(BookDTO bookDTO);

    public List<BookDTO> getAllBooks();

    public BookDTO getBookById(Long id);

    public BookDTO updateBook(Long id, BookDTO bookDTO);

    public String deleteBookById(Long id);
}
