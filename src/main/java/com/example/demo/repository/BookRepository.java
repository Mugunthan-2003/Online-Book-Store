package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.entity.Book;
import java.lang.Integer;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
    //Interface to interact with database.
}
