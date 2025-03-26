package com.example.demo.entity;

import java.math.BigDecimal;
import java.time.LocalDate; 
import jakarta.persistence.*;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String author;
    @Column(precision=10, scale=2)
    private BigDecimal price;
    @Column(name = "Published_Date")
    private LocalDate publishedDate;

    public Book() {}

    public Book(String title, String author, BigDecimal price, LocalDate publishedDate) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.publishedDate = publishedDate;
    }

    // Setters for the fields
    public void setId(int id) { 
        this.id = id; 
    }
    public void setTitle(String title) { 
        this.title = title; 
    }
    public void setAuthor(String author) { 
        this.author = author; 
    }
    public void setPublishedDate(LocalDate publishedDate) { 
        this.publishedDate = publishedDate; 
    }
    public void setPrice(BigDecimal price) { 
        this.price = price; 
    }

    // Getters for the fields
    public int getId() { 
        return id; 
    }
    public String getAuthor() { 
        return author; 
    }
    public String getTitle() { 
        return title; 
    }
    public BigDecimal getPrice() { 
        return price; 
    }
    public LocalDate getPublishedDate() { 
        return publishedDate; 
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", publishedDate=" + publishedDate +
                '}';
    }
}
