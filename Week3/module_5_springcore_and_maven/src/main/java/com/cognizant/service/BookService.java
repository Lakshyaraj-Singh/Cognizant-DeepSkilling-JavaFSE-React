package com.cognizant.service;
import com.cognizant.repository.BookRepository;;
public class BookService {
    private BookRepository bookRepository;
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
}
