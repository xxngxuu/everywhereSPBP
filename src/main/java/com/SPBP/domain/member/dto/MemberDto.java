package com.SPBP.domain.member.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor
public class MemberDto {
    private String uuid;
    private String email;
    private String pwd;
    private int intermediary;
    private String phoneNumber;
    private String sex;
    private String birth;

}
