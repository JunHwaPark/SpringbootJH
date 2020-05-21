package com.junhwa.springboot.web.dto;

import com.junhwa.springboot.web.domain.location.Location;
import lombok.Getter;

@Getter
public class LocationListResponseDto {
    private Long id;
    private double longitude, latitude;

    public LocationListResponseDto(Location entity) {
        this.id = entity.getId();
        this.longitude = entity.getLongitude();
        this.latitude = entity.getLatitude();
    }
}