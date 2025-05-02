package com.SPBP.domain.house.service;

import com.SPBP.domain.house.dto.HouseInfoDto;
import com.SPBP.domain.house.dto.HouseRegistrationDto;

import java.util.List;

public interface HouseRegistrationService {

    int registerHouse(HouseRegistrationDto houseRegistrationDto);
    HouseRegistrationDto getRegisteredHouse(String uuid, String aptSeq);
    List<HouseRegistrationDto> getRegisteredApartments(String uuid);
    int updateRegisteredHouse(HouseRegistrationDto houseRegistrationDto);
    int deleteRegisteredHouseByAptSeq(String aptSeq);
    List<HouseInfoDto> searchApartmentsByName(String aptNm);

}
