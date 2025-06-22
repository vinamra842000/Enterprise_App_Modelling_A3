package com.assignment.library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.assignment.library.model.Member;
import com.assignment.library.service.MemberService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/members")
public class MemberController {

    @Autowired
    private MemberService memberService;

    @PostMapping
    public Mono<Member> createMember(@RequestBody Member member) {
        return memberService.createMember(member);
    }

    @GetMapping
    public Flux<Member> getAllMembers() {
        return memberService.getAllMembers();
    }
}
