package com.gblogdemoapp.controller;

import com.gblogdemoapp.dto.TrainDto;
import com.gblogdemoapp.service.TrainService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/train")
public class TrainController {
    /*private TrainService trainService;

    public TrainController(TrainService trainService) {
        this.trainService = trainService;
    }*/
    /* @PostMapping
    public ResponseEntity<Train> addTrain(
            @RequestBody Train train
    ){
        Train train1 = trainService.addTrain(train);
        return new ResponseEntity<>(train1, HttpStatus.CREATED);
    }*/
    /*@PostMapping
    public ResponseEntity<TrainDto> addTrain(
            @RequestBody TrainDto dto
    ){
      TrainDto dtoT = trainService.addTrain(dto);
      return new ResponseEntity<>(dtoT,HttpStatus.CREATED);
    }*/
    private TrainService trainService;

    public TrainController(TrainService trainService) {
        this.trainService = trainService;
    }

    @PostMapping
    public ResponseEntity<TrainDto> addTrains(
            @RequestBody TrainDto dto
    ){
        TrainDto trainDto = trainService.addTrains(dto);
        return new ResponseEntity<>(trainDto,HttpStatus.CREATED);
    }
}
