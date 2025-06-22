package com.assignment.library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.assignment.library.model.Member;
import com.assignment.library.model.Publisher;
import com.assignment.library.service.PublisherService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/publishers")
public class PublisherController {

    @Autowired
    private PublisherService publisherService;

    @PostMapping
    public Mono<Publisher> createPublisher(@RequestBody Publisher publisher) {
        return publisherService.createPublisher(publisher);
    }
    
    @GetMapping
    public Flux<Publisher> getAllMembers() {
        return publisherService.getAllPublishers();
    }
}
