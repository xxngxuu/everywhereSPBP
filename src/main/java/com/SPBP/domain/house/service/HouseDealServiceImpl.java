package com.SPBP.domain.house.service;

import com.SPBP.domain.house.dto.HouseDealDto;
import com.SPBP.domain.house.mapper.HouseMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class HouseDealServiceImpl implements HouseDealService {

    private final HouseMapper houseMapper;

    @Override
    public int registerHouseDeal(HouseDealDto houseDealDto) {
        return houseMapper.registerHouseDeal(houseDealDto);
    }

    @Override
    public List<HouseDealDto> findHouseDeals(String aptSeq) {
        return houseMapper.findHouseDeals(aptSeq);
    }

    @Override
    public List<HouseDealDto> getHouseDealsInBounds(double swLat, double neLat, double swLng, double neLng) {
        return houseMapper.getHouseDealsInBounds(swLat, neLat, swLng, neLng);
    }

    @Override
    public int updateHouseDeal(HouseDealDto houseDealDto) {
        return houseMapper.updateHouseDeal(houseDealDto);
    }

    @Override
    public int deleteHouseDealByNo(int no) {
        return houseMapper.deleteHouseDealByNo(no);
    }
}
