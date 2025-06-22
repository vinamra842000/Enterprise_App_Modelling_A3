package com.assignment.library.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.assignment.library.model.Member;
import com.assignment.library.repository.MemberRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class MemberService {

    @Autowired
    private MemberRepository memberRepo;

    public Mono<Member> createMember(Member member) {
        return memberRepo.save(member);
    }

    public Flux<Member> getAllMembers() {
        return memberRepo.findAll();
    }
}
