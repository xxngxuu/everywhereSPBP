package com.SPBP.domain.member.exception;

public class DuplicatePhoneException extends RuntimeException {
    public DuplicatePhoneException() {
        super("이미 등록된 전화번호입니다.");
    }
}