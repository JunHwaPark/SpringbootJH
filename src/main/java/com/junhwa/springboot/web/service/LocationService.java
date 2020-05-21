package com.junhwa.springboot.web.service;

import com.junhwa.springboot.web.domain.location.LocationRepository;
import com.junhwa.springboot.web.dto.LocationListResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class LocationService {
    private final LocationRepository locationRepository;

    @Transactional
    public List<LocationListResponseDto> findAllDesc() {
        return locationRepository.findAllDesc().stream()
                .map(LocationListResponseDto::new)
                .collect(Collectors.toList());
    }
}
