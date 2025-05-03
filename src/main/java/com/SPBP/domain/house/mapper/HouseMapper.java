package com.SPBP.domain.house.mapper;

import com.SPBP.domain.house.dto.HouseDealDto;
import com.SPBP.domain.house.dto.HouseInfoDto;
import com.SPBP.domain.house.dto.HouseRegistrationDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface HouseMapper {

    int registerHouseDeal(HouseDealDto houseDealDto);
    List<HouseDealDto> selectedHouseDeals(String aptSeq);
    List<HouseDealDto> getHouseDealsInBounds(double swLat, double neLat, double swLng, double neLng);
    int updateHouseDeal(HouseDealDto houseDealDto);
    int deleteHouseDealByNo(int no);

    int registerHouseInfo(HouseInfoDto houseInfoDto);
    HouseInfoDto findHouseInfoByAptSeq(String aptSeq);
    List<HouseInfoDto> getHouseInfosInBounds(double swLat, double neLat, double swLng, double neLng);
    int updateHouseInfo(HouseInfoDto houseInfoDto);
    int deleteHouseInfoByAptSeq(String aptSeq);

    int registerHouse(HouseRegistrationDto houseRegistrationDto);
    HouseRegistrationDto getRegisteredHouse(String uuid, String aptSeq);
    List<HouseRegistrationDto> getRegisteredApartments(String uuid);
    int updateRegisteredHouse(HouseRegistrationDto houseRegistrationDto);
    int deleteRegisteredHouseByAptSeq(String aptSeq);
    List<HouseInfoDto> searchApartmentsByName(String aptNm);
}
