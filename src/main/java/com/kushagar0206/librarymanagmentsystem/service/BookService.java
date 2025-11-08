package com.kushagar0206.librarymanagmentsystem.service;

import com.kushagar0206.librarymanagmentsystem.dto.BookDTO;
import java.util.List;

public interface BookService {

    public BookDTO addBook(BookDTO bookDTO);

    public List<BookDTO> getAllBook();

    public BookDTO getBookById(Long id);

    public BookDTO updateBookById(Long id, BookDTO bookDTO);

    public String deleteBookById(Long id);
}
