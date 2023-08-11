package org.example;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {

    private final MemberRepository memberRepository;

    public MemberController(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @PostMapping("/members ")
    public ResponseEntity<Member> createMember(@RequestBody Member member) {
        Member savedMember = memberRepository.save(member);
        return ResponseEntity.ok(savedMember);
    }
}
