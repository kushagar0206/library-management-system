package com.kushagar0206.librarymanagmentsystem.mapper;

import com.kushagar0206.librarymanagmentsystem.dto.BookDTO;
import com.kushagar0206.librarymanagmentsystem.model.Book;
import org.mapstruct.Mapper;

     @Mapper(componentModel = "spring")
    public interface BookMapper {

        BookDTO toDto(Book book);
        Book toEntity(BookDTO bookDTO);

     }

