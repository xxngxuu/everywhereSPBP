package com.SPBP.domain.member.service;

import com.SPBP.domain.house.dto.HouseInfoDto;
import com.SPBP.domain.member.dto.MemberDto;
import com.SPBP.domain.member.exception.DuplicateEmailException;
import com.SPBP.domain.member.exception.DuplicatePhoneException;
import com.SPBP.domain.member.mapper.MemberMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {

    private final MemberMapper memberMapper;

    @Transactional
    @Override
    public void registerMember(MemberDto member) {
        if (memberMapper.findByEmail(member.getEmail()) == 1){
            throw new DuplicateEmailException(); // 이메일 중복 검사
        }
        if(memberMapper.findByPhoneNumber(member.getPhoneNumber())==1){
            throw new DuplicatePhoneException(); // 전화번호 중복 검사
        }
        member.setUuid(UUID.randomUUID().toString());
//        이메일 암호화 (시큐리티) 적용하기
        int result = memberMapper.registerMember(member);
        if (result != 1){
            throw new RuntimeException("회원가입 실패");
        }
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
