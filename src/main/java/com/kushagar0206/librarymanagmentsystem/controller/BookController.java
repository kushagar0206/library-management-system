package com.kushagar0206.librarymanagmentsystem.controller;

import com.kushagar0206.librarymanagmentsystem.dto.BookDTO;
import com.kushagar0206.librarymanagmentsystem.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
@RequiredArgsConstructor
public class BookController {

    private final BookService bookService;

    @PostMapping(path = "/add")
    public String addBook(@RequestBody BookDTO bookDTO){
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
    public String updatebook(){
        return "t";
    }

    @DeleteMapping(path = "/delete/{id}")
    public String deleteBookById(@PathVariable Long id){
        return bookService.deleteBookById(id);
    }

}
