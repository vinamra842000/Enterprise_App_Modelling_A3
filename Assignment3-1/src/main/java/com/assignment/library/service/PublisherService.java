package com.assignment.library.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.assignment.library.model.Publisher;
import com.assignment.library.repository.PublisherRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PublisherService {
    @Autowired
    private PublisherRepository publisherRepo;

    public Mono<Publisher> createPublisher(Publisher publisher) {
        return publisherRepo.save(publisher);
    }

    public Flux<Publisher> getAllPublishers() {
        return publisherRepo.findAll();
    }
}
