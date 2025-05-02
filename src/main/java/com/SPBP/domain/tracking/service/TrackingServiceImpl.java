package com.SPBP.domain.tracking.service;

import com.SPBP.domain.tracking.mapper.TrackingMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TrackingServiceImpl implements TrackingService {

    private final TrackingMapper trackingMapper;
}
