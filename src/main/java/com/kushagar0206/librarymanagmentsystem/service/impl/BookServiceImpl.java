package com.kushagar0206.librarymanagmentsystem.service.impl;

import com.kushagar0206.librarymanagmentsystem.dto.BookDTO;
import com.kushagar0206.librarymanagmentsystem.model.Book;
import com.kushagar0206.librarymanagmentsystem.repository.BookRepository;
import com.kushagar0206.librarymanagmentsystem.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService{

    private final BookRepository bookRepository;

    @Override
    public String addBook(BookDTO bookDTO) {
        Book book = (Book) Stream.of(bookDTO, Book.class);
        bookRepository.save(book);
        return "Book Add Successfully";
    }

    @Override
    public List<BookDTO> getAllBook() {
      List<Book> book = Collections.singletonList((Book) bookRepository.findAll());
       List<BookDTO> bookDTO = (List<BookDTO>) Stream.of(book, BookDTO.class);
        return bookDTO;
    }

    @Override
    public BookDTO getBookById(Long id) {
       Book book = (Book) bookRepository.findAllById(Collections.singleton(id));
      BookDTO bookDTO = (BookDTO) Stream.of(book, BookDTO.class);
        return bookDTO;
    }

    @Override
    public boolean updateBookById(Long id) {
        return false;
    }

    @Override
    public String deleteBookById(Long id) {
        bookRepository.deleteById(id);
        return "Book Deleted Successfully";
    }
}
