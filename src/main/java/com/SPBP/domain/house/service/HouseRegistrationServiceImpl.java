package com.SPBP.domain.house.service;

import com.SPBP.domain.house.dto.HouseInfoDto;
import com.SPBP.domain.house.dto.HouseRegistrationDto;
import com.SPBP.domain.house.mapper.HouseMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HouseRegistrationServiceImpl implements HouseRegistrationService {

    private final HouseMapper houseMapper;

    @Override
    public int registerHouse(HouseRegistrationDto houseRegistrationDto) {
        return houseMapper.registerHouse(houseRegistrationDto);
    }

    @Override
    public HouseRegistrationDto getRegisteredHouse(String uuid, String aptSeq) {
        return houseMapper.getRegisteredHouse(uuid, aptSeq);
    }

    @Override
    public List<HouseRegistrationDto> getRegisteredApartments(String uuid) {
        return houseMapper.getRegisteredApartments(uuid);
    }

    @Override
    public int updateRegisteredHouse(HouseRegistrationDto houseRegistrationDto) {
        return houseMapper.updateRegisteredHouse(houseRegistrationDto);
    }

    @Override
    public int deleteRegisteredHouseByAptSeq(String aptSeq) {
        return houseMapper.deleteRegisteredHouseByAptSeq(aptSeq);
    }

    @Override
    public List<HouseInfoDto> searchApartmentsByName(String aptNm) {
        return houseMapper.searchApartmentsByName(aptNm);
    }
}
