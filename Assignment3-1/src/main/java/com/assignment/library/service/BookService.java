package com.assignment.library.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.assignment.library.model.Book;
import com.assignment.library.repository.BookRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepo;

    public Mono<Book> createBook(Book book) {
        return bookRepo.save(book);
    }

    public Flux<Book> getAllBooks() {
        return bookRepo.findAll();
    }
}
