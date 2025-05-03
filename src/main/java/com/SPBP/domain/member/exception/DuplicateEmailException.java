package com.SPBP.domain.member.exception;

public class DuplicateEmailException extends RuntimeException{
     // 여기서만 쓰니까. (공통은 전역으로 빼기)
    public DuplicateEmailException() {
        super("이미 존재하는 이메일 입니다");
    }
}
