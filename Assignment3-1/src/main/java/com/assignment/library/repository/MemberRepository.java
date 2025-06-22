package com.assignment.library.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import com.assignment.library.model.Member;

public interface MemberRepository extends ReactiveMongoRepository<Member, String> {}
