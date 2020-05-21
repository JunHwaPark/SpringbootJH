package com.junhwa.springboot.web.domain.location;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface LocationRepository extends JpaRepository<Location, Long> { //<Entity class, pk type>
    @Query(value = "select * from Location order by id desc", nativeQuery=true)
    List<Location> findAllDesc();
}
