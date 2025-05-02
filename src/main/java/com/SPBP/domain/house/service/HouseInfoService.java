package com.SPBP.domain.house.service;

import com.SPBP.domain.house.dto.HouseInfoDto;

import java.util.List;

public interface HouseInfoService {

    int registerHouseInfo(HouseInfoDto houseInfoDto);
    HouseInfoDto findHouseInfoByAptSeq(String aptSeq);
    List<HouseInfoDto> getHouseInfosInBounds(double swLat, double neLat, double swLng, double neLng);
    int updateHouseInfo(HouseInfoDto houseInfoDto);
    int deleteHouseInfoByAptSeq(String aptSeq);

}
