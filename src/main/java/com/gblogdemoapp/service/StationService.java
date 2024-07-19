package com.gblogdemoapp.service;

import com.gblogdemoapp.dto.StationDto;
import com.gblogdemoapp.entity.Station;
import com.gblogdemoapp.repository.StationRepository;
import com.gblogdemoapp.repository.TrainRepository;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class StationService {
   /* private StationRepository stationRepository;

    public StationService(StationRepository stationRepository) {
        this.stationRepository = stationRepository;
    }

    public StationDto addStationName(StationDto dto) {
        Station station = new Station();
        station.setName(dto.getName());
        Station savedStation = stationRepository.save(station);

        dto.setId(savedStation.getId());
        dto.setName(savedStation.getName());
        dto.setDate(new Date());
        return dto;
    }*/

    /*public Station addStations(Station stations) {
        Station save = stationRepository.save(stations);
        return save;
    }*/

    private TrainRepository trainRepository;

    public StationService(TrainRepository trainRepository) {
        this.trainRepository = trainRepository;
    }
}
