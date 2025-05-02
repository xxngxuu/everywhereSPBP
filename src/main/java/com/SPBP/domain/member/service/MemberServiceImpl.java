package com.SPBP.domain.member.service;

import com.SPBP.domain.house.dto.HouseInfoDto;
import com.SPBP.domain.member.dto.MemberDto;
import com.SPBP.domain.member.mapper.MemberMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {

    private final MemberMapper memberMapper;


    @Override
    public int registerMember(MemberDto member) {
        return memberMapper.registerMember(member);
    }

    @Override
    public MemberDto findMember(MemberDto member) {
        return memberMapper.findMember(member);
    }

    @Override
    public int updateMember(MemberDto member) {
        return memberMapper.updateMember(member);
    }

    @Override
    public int deleteMemberByEmail(String userEmail) {
        return memberMapper.deleteMemberByEmail(userEmail);
    }

    @Override
    public int addInterestItem(String email, String aptSeq, String aptNm) {
        return memberMapper.addInterestItem(email, aptSeq, aptNm);
    }

    @Override
    public List<HouseInfoDto> listInterestItems(String email) {
        return memberMapper.listInterestItems(email);
    }

    @Override
    public int removeInterestItem(String email, String aptSeq, String aptNm) {
        return memberMapper.removeInterestItem(email, aptSeq, aptNm);
    }
}
