package com.gblogdemoapp.controller;

import com.gblogdemoapp.dto.StationDto;
import com.gblogdemoapp.entity.Station;
import com.gblogdemoapp.service.StationService;
import com.gblogdemoapp.service.TrainService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/stations")
public class StationController {
    /*private StationService stationService;

    public StationController(StationService stationService) {
        this.stationService = stationService;
    }
    @PostMapping
    public ResponseEntity<StationDto> addStationName(
            @RequestBody StationDto dto
    ){
        StationDto stationDto = stationService.addStationName(dto);
        return new ResponseEntity<>(stationDto,HttpStatus.CREATED);
    }*/

    private TrainService trainService;

    public StationController(TrainService trainService) {
        this.trainService = trainService;
    }
    @PostMapping
    public ResponseEntity<StationDto> addStations(
        @RequestBody StationDto stationDto
    ){
        StationDto stationDto1 = trainService.addStations(stationDto);
        return new ResponseEntity<>(stationDto1,HttpStatus.CREATED);
    }
}
