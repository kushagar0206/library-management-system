package com.kushagar0206.librarymanagementsystem.mapper;

import com.kushagar0206.librarymanagementsystem.dto.BookDTO;
import com.kushagar0206.librarymanagementsystem.model.Book;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-04-20T22:39:56+0530",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.46.0.v20260407-0427, environment: Java 21.0.10 (Eclipse Adoptium)"
)
@Component
public class BookMapperImpl implements BookMapper {

    @Override
    public BookDTO toDTO(Book book) {
        if ( book == null ) {
            return null;
        }

        BookDTO bookDTO = new BookDTO();

        bookDTO.setAuthorName( book.getAuthorName() );
        bookDTO.setDate( book.getDate() );
        bookDTO.setId( book.getId() );
        bookDTO.setName( book.getName() );

        return bookDTO;
    }

    @Override
    public Book toEntity(BookDTO bookDTO) {
        if ( bookDTO == null ) {
            return null;
        }

        Book book = new Book();

        book.setAuthorName( bookDTO.getAuthorName() );
        book.setDate( bookDTO.getDate() );
        book.setId( bookDTO.getId() );
        book.setName( bookDTO.getName() );

        return book;
    }
}
