package com.SPBP.domain.house.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SPBP.domain.house.dto.HouseDealDto;
import com.SPBP.domain.house.service.HouseDealService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/apt")
@Slf4j
public class HouseDealController {
	
	private final HouseDealService houseDealService;
	
	@GetMapping("/apts/{swLat}/{swLng}/{neLat}/{neLng}")
	public ResponseEntity<?> houseDealData(
				@PathVariable double swLat,
				@PathVariable double swLng,
				@PathVariable double neLat,
				@PathVariable double neLng
			){
		log.info("요청 들어옴: {}, {}, {}, {}", swLat, swLng, neLat, neLng);
		List<HouseDealDto> houseDeals = houseDealService.getHouseDealsInBounds(swLat, neLat, swLng, neLng);
		return new ResponseEntity<List<HouseDealDto>>(houseDeals,HttpStatus.OK);
	}
	@GetMapping("/{aptSeq}")
	public ResponseEntity<?> selectedHouseDealData(@PathVariable String aptSeq){
		log.info("요청 들어옴 : {}",aptSeq);
		List<HouseDealDto> selectedHouseDeals = houseDealService.selectedHouseDeals(aptSeq.trim());
		log.info("result : {}",selectedHouseDeals);
		return new ResponseEntity<List<HouseDealDto>>(selectedHouseDeals,HttpStatus.OK);
	}
}
