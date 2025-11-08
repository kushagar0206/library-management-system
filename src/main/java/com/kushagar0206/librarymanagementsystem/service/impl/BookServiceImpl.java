package com.kushagar0206.librarymanagementsystem.service.impl;

import com.kushagar0206.librarymanagementsystem.mapper.BookMapper;
import com.kushagar0206.librarymanagementsystem.dto.BookDTO;
import com.kushagar0206.librarymanagementsystem.model.Book;
import com.kushagar0206.librarymanagementsystem.repository.BookRepository;
import com.kushagar0206.librarymanagementsystem.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService{

    private final BookRepository bookRepository;
    private final BookMapper bookMapper;

    @Override
    public BookDTO addBook(BookDTO bookDTO) {
        Book book = bookMapper.toEntity(bookDTO);
        return bookMapper.toDTO(bookRepository.save(book));
    }

    @Override
    public BookDTO getBookById(Long id) {
        Book book = bookRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Book not found with ID " + id));
        return bookMapper.toDTO(book);
    }

    @Override
    public List<BookDTO> getAllBooks() {
        return bookRepository.findAll()
                .stream()
                .map(bookMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public BookDTO updateBook(Long id, BookDTO bookDTO) {
        Book existing = bookRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Book not found with ID " + id));
        existing.setName(bookDTO.getName());
        existing.setAuthorName(bookDTO.getAuthorName());
        return bookMapper.toDTO(bookRepository.save(existing));
    }

    @Override
    public String deleteBookById(Long id) {
        bookRepository.deleteById(id);
        return "Book Deleted Successfully";
    }
}
