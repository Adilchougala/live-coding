package com.gblogdemoapp.repository;

import com.gblogdemoapp.entity.Station;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StationRepository extends JpaRepository<Station, Long> {
}