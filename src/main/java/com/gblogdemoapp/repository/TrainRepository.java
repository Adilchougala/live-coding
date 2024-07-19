package com.gblogdemoapp.repository;

import com.gblogdemoapp.entity.Train;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrainRepository extends JpaRepository<Train, Long> {
}