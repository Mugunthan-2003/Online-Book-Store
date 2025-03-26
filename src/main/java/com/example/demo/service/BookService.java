package com.example.demo.service;

import com.example.demo.entity.Book;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    // Add the book to database
    public Book addBook(Book book) {
        return bookRepository.save(book);
    }

    // Get all books
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    // Get a particular book
    public Book getBookById(int id) {  
        return bookRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Book not found with ID: " + id));
    }

    // Update book details
    public Book updateBook(int id, Book updatedBook) {  
        Book existingBook = getBookById(id);  // Fetch the existing book using getBookById
        existingBook.setTitle(updatedBook.getTitle());
        existingBook.setAuthor(updatedBook.getAuthor());
        existingBook.setPrice(updatedBook.getPrice());
        existingBook.setPublishedDate(updatedBook.getPublishedDate());
        return bookRepository.save(existingBook);
    }

    // Remove a  book
    public void deleteBook(int id) { 
        // book to delete
        Book bookToDelete = getBookById(id);  
        bookRepository.delete(bookToDelete);
    }
}
