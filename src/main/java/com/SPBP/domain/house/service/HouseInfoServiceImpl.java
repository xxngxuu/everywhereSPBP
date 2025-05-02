package com.SPBP.domain.house.service;

import com.SPBP.domain.house.dto.HouseInfoDto;
import com.SPBP.domain.house.mapper.HouseMapper;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.List;
@Setter
@RequiredArgsConstructor
public class HouseInfoServiceImpl implements HouseInfoService {

    private final HouseMapper houseMapper;

    @Override
    public int registerHouseInfo(HouseInfoDto houseInfoDto) {
        return houseMapper.registerHouseInfo(houseInfoDto);
    }

    @Override
    public HouseInfoDto findHouseInfoByAptSeq(String aptSeq) {
        return houseMapper.findHouseInfoByAptSeq(aptSeq);
    }

    @Override
    public List<HouseInfoDto> getHouseInfosInBounds(double swLat, double neLat, double swLng, double neLng) {
        return houseMapper.getHouseInfosInBounds(swLat, neLat, swLng, neLng);
    }

    @Override
    public int updateHouseInfo(HouseInfoDto houseInfoDto) {
        return houseMapper.updateHouseInfo(houseInfoDto);
    }

    @Override
    public int deleteHouseInfoByAptSeq(String aptSeq) {
        return houseMapper.deleteHouseInfoByAptSeq(aptSeq);
    }
}
