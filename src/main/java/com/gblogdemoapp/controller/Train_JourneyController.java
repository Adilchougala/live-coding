package com.gblogdemoapp.controller;

import com.gblogdemoapp.dto.TrainJourneyDto;
import com.gblogdemoapp.entity.Train_Journey;
import com.gblogdemoapp.repository.Train_JourneyRepository;
import com.gblogdemoapp.service.Train_JourneyService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/train_journey")
public class Train_JourneyController {

   /* private Train_JourneyService trainJourneyService;

    public Train_JourneyController(Train_JourneyService trainJourneyService) {
        this.trainJourneyService = trainJourneyService;
    }
   @PostMapping
    public ResponseEntity<Train_Journey> selectJourney(
      @RequestParam long trainId,
      @RequestParam long stationId,
      @RequestBody Train_Journey journey
   ){
       Train_Journey journey1 = trainJourneyService.selectJourney(trainId, stationId, journey);
       return new ResponseEntity<>(journey1,HttpStatus.CREATED);
   }*/

    private Train_JourneyService trainJourneyService;
    private final Train_JourneyRepository train_JourneyRepository;

    public Train_JourneyController(Train_JourneyService trainJourneyService,
                                   Train_JourneyRepository train_JourneyRepository) {
        this.trainJourneyService = trainJourneyService;
        this.train_JourneyRepository = train_JourneyRepository;
    }
    @PostMapping
     public ResponseEntity<Train_Journey> createTrainJourney(
             @RequestParam long trainId,
             @RequestParam long stationId,
             @RequestBody Train_Journey trainJourney
     ){
        Train_Journey trainJourney1 = trainJourneyService.createTrainJourney(trainId, stationId, trainJourney);
        return new ResponseEntity<>(trainJourney1,HttpStatus.CREATED);
    }
}
