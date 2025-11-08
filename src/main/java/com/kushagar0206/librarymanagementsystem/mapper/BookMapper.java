package com.kushagar0206.librarymanagementsystem.mapper;

import com.kushagar0206.librarymanagementsystem.dto.BookDTO;
import com.kushagar0206.librarymanagementsystem.model.Book;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BookMapper {
    BookDTO toDto(Book entity);
    Book toEntity(BookDTO dto);
}


