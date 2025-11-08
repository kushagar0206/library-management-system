package com.kushagar0206.librarymanagmentsystem.service.impl;

import com.kushagar0206.librarymanagmentsystem.mapper.BookMapper;
import com.kushagar0206.librarymanagmentsystem.dto.BookDTO;
import com.kushagar0206.librarymanagmentsystem.model.Book;
import com.kushagar0206.librarymanagmentsystem.repository.BookRepository;
import com.kushagar0206.librarymanagmentsystem.service.BookService;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService{

    private BookRepository bookRepository;
    private BookMapper bookMapper;

    public BookServiceImpl(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    public BookServiceImpl(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    @Override
    public BookDTO addBook(BookDTO bookDTO) {
        Book book = bookMapper.toEntity(bookDTO);
         bookRepository.save(book);
         return bookMapper.toDto(bookRepository.save(book));
    }

    @Override
    public List<BookDTO> getAllBook() {
        return bookRepository.findAll()
                .stream()
                .map(bookMapper::toDto)
                .collect(Collectors.toUnmodifiableList());
    }

    @Override
    public BookDTO getBookById(Long id) {
       Book book = bookRepository.findById(id)
               .orElseThrow(() -> new RuntimeException("User not foung"));
        return bookMapper.toDto(book);
    }

    @Override
    public BookDTO updateBookById(Long id, BookDTO bookDTO) {
        Book existingBook = bookRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));
        existingBook.setName(bookDTO.getName());
        existingBook.setAuthorName(bookDTO.getAuthorName());
        return bookMapper.toDto(bookRepository.save(existingBook));
    }

    @Override
    public String deleteBookById(Long id) {
        bookRepository.deleteById(id);
        return "Book Deleted Successfully";
    }
}
