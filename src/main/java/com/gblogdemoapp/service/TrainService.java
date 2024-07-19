package com.gblogdemoapp.service;

import com.gblogdemoapp.dto.StationDto;
import com.gblogdemoapp.dto.TrainDto;
import com.gblogdemoapp.entity.Station;
import com.gblogdemoapp.entity.Train;
import com.gblogdemoapp.repository.StationRepository;
import com.gblogdemoapp.repository.TrainRepository;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class TrainService {
    private TrainRepository trainRepository;
    private final StationRepository stationRepository;

    public TrainService(TrainRepository trainRepository,
                        StationRepository stationRepository) {
        this.trainRepository = trainRepository;
        this.stationRepository = stationRepository;
    }

    public TrainDto addTrains(TrainDto dto) {
        Train train = new Train();
        train.setName(dto.getName());
        Train saveTrain = trainRepository.save(train);

        dto.setId(saveTrain.getId());
        dto.setName(saveTrain.getName());
        dto.setDate(new Date());
        dto.setAddedTrain("new Train is added "+saveTrain.getName());
        return dto;
    }

    public StationDto addStations(StationDto stationDto) {
        Station station = new Station();
        station.setName(stationDto.getName());
        Station saveStation = stationRepository.save(station);

        stationDto.setId(saveStation.getId());
        stationDto.setName(saveStation.getName());
        stationDto.setDate(new Date());
        return stationDto;
    }
    /*private TrainRepository trainRepository;

    public TrainService(TrainRepository trainRepository) {
        this.trainRepository = trainRepository;
    }

    public TrainDto addTrain(TrainDto dto) {
        Train train = new Train();
        train.setName(dto.getName());
        Train savedTrain = trainRepository.save(train);
        dto.setId(savedTrain.getId());
        dto.setName(savedTrain.getName());
        dto.setDate(new Date());
        dto.setAddedTrain("new train name is added");
        return dto;
    }*/

    /*public Train addTrain(Train train) {
        Train save = trainRepository.save(train);
        return save;
    }*/
}
