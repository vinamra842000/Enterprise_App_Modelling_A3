package com.assignment.library.repository;


import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import com.assignment.library.model.Publisher;

public interface PublisherRepository extends ReactiveMongoRepository<Publisher, String> {}
