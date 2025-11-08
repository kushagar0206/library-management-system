package com.kushagar0206.librarymanagmentsystem.repository;

import com.kushagar0206.librarymanagmentsystem.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

}
