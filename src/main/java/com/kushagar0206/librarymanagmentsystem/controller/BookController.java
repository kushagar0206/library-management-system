package com.kushagar0206.librarymanagmentsystem.controller;

import com.kushagar0206.librarymanagmentsystem.dto.BookDTO;
import com.kushagar0206.librarymanagmentsystem.service.BookService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
@RequiredArgsConstructor
public class BookController {

    private final BookService bookService;

    @PostMapping(path = "/add")
    public BookDTO addBook(@RequestBody BookDTO bookDTO){
        return bookService.addBook(bookDTO);
    }

    @GetMapping(path = "/getAll")
    public List<BookDTO> getAllBooks(){
        return bookService.getAllBook();
    }

    @GetMapping(path = "/get/{id}")
    public BookDTO getBookById(@PathVariable Long id){
        return bookService.getBookById(id);
    }

    @PutMapping(path = "/update")
    public BookDTO updatebook(Long id, BookDTO bookDTO){
        return bookService.updateBookById(id, bookDTO);
    }

    @DeleteMapping(path = "/delete/{id}")
    public String deleteBookById(@PathVariable Long id){
        return bookService.deleteBookById(id);
    }

}
