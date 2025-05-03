package com.SPBP.domain.house.service;

import com.SPBP.domain.house.dto.HouseDealDto;

import java.util.List;

public interface HouseDealService {
    int registerHouseDeal(HouseDealDto houseDealDto);
    List<HouseDealDto> selectedHouseDeals(String aptSeq);
    List<HouseDealDto> getHouseDealsInBounds(double swLat, double neLat, double swLng, double neLng);
    int updateHouseDeal(HouseDealDto houseDealDto);
    int deleteHouseDealByNo(int no);

}
