package com.assignment.library.repository;


import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import com.assignment.library.model.Book;

public interface BookRepository extends ReactiveMongoRepository<Book, String> {}
