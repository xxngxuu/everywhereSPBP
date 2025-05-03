package com.SPBP.domain.member.service;

import com.SPBP.domain.house.dto.HouseInfoDto;
import com.SPBP.domain.member.dto.MemberDto;

import java.util.List;

public interface MemberService {
    void registerMember(MemberDto member);
    MemberDto findMember(MemberDto member);
    int updateMember(MemberDto member);
    int deleteMemberByEmail(String userEmail);
    int addInterestItem(String email,String aptSeq,String aptNm);
    List<HouseInfoDto> listInterestItems(String email);
    int removeInterestItem(String email, String aptSeq, String aptNm);

}
