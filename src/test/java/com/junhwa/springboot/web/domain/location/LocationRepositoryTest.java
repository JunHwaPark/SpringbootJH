package com.junhwa.springboot.web.domain.location;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LocationRepositoryTest {
    @Autowired
    private LocationRepository locationRepository;

    @After
    public void cleanup() {
        locationRepository.deleteAll();
    }

    @Test
    public void saveNLoadPost() {
        //given
        double longitude = 35d;
        double latitude = 128d;

        locationRepository.save(Location.builder()
                .longitude(longitude)
                .latitude(latitude)
                .build());

        //when
        List<Location> locations = locationRepository.findAll();

        //then
        Location location = locations.get(0);
        assertThat(location.getLongitude()).isEqualTo(longitude);
        assertThat(location.getLatitude()).isEqualTo(latitude);
    }
}
