package com.SPBP.domain.member.controller;

import com.SPBP.domain.member.dto.MemberDto;
import com.SPBP.domain.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/member")
public class MemberController {
    private final MemberService memberService;

//    @GetMapping("/")
//    public String index() {
//        // 로그인 및 회원가입 페이지
//        return "";
//    }

    @PostMapping("/join")
    public ResponseEntity<String> join(@RequestBody MemberDto memberDto) {
        memberService.registerMember(memberDto);
        return ResponseEntity.status(HttpStatus.CREATED).body("회원가입 성공");
    }

}
