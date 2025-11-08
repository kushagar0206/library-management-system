package com.kushagar0206.librarymanagmentsystem.service;

import com.kushagar0206.librarymanagmentsystem.dto.BookDTO;
import java.util.List;

public interface BookService {

    public String addBook(BookDTO bookDTO);

    public List<BookDTO> getAllBook();

    public BookDTO getBookById(Long id);

    public boolean updateBookById(Long id);

    public String deleteBookById(Long id);
}
