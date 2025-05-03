package com.SPBP.domain.member.mapper;

import com.SPBP.domain.house.dto.HouseInfoDto;
import com.SPBP.domain.member.dto.MemberDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface MemberMapper {
    int registerMember(MemberDto member);
    MemberDto findMember(MemberDto member);
    int updateMember(MemberDto member);
    int deleteMemberByEmail(String userEmail);
    int addInterestItem(String email,String aptSeq,String aptNm);
    List<HouseInfoDto> listInterestItems(String email);
    int removeInterestItem(String email, String aptSeq, String aptNm);

    // 사전 처리를 위한 메서드
    int findByEmail(String email);
    int findByPhoneNumber(String phoneNumber);

}
