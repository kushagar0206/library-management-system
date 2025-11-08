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
