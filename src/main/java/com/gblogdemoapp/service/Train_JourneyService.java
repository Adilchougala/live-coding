package com.gblogdemoapp.service;

import com.gblogdemoapp.dto.TrainJourneyDto;
import com.gblogdemoapp.entity.Station;
import com.gblogdemoapp.entity.Train;
import com.gblogdemoapp.entity.Train_Journey;
import com.gblogdemoapp.repository.StationRepository;
import com.gblogdemoapp.repository.TrainRepository;
import com.gblogdemoapp.repository.Train_JourneyRepository;
import org.springframework.stereotype.Service;

import javax.crypto.spec.PSource;
import java.util.Optional;

@Service
public class Train_JourneyService {
    private Train_JourneyRepository trainJourneyRepository;

    public Train_JourneyService(Train_JourneyRepository trainJourneyRepository, TrainRepository trainRepository,
                                StationRepository stationRepository) {
        this.trainJourneyRepository = trainJourneyRepository;
        this.trainRepository = trainRepository;
        this.stationRepository = stationRepository;
    }
    private TrainRepository trainRepository;
    private StationRepository stationRepository;

    //WE CAN DO BOTH USING OPTIONAL CLASS AND DIRECT CONVERT THIS WITH .GET()
    //BOTH WILL WORK BUT THIS APPROACH IS NOT GOOD
    //TRY TO USE OPTIONAL CLASS
    /*public Train_Journey startJourney(long trainId, long stationId, Train_Journey journey) {
        Train train = trainRepository.findById(trainId).get();
        journey.setTrain(train);

        Station station = stationRepository.findById(stationId).get();
        journey.setStation(station);

        Train_Journey save = trainJourneyRepository.save(journey);
        return save;
    }
*/


    //USING OPTIONAL CLASS FOR AVOID NULL POINTER EXCEPTION,
    //IF WE NOT USE OPTIONAL CLASS AND WE GIVE ID'S WHICH IS NOT PRESENT IN DATABASE THEN THIS CODE WILL
    //BE CRASH AND USING OPTIONAL CLASS AND IF WE GIVE ID'S WHICH IS NOT PRESENT IN DATABASE THEN IT WILL NOT
    //CRASH AND THIS WILL BE PRINT THE MSG IN CONSOLE "sorry no Id is present with this Train id" LIKE THIS
    public Train_Journey createTrainJourney(long trainId, long stationId, Train_Journey trainJourney) {
        Optional<Train> byId = trainRepository.findById(trainId);
        Train train = null;
        if(byId.isPresent()){
          train = byId.get();
        } else {
            System.out.println("sorry no Id is present with this Train id "+trainId);
        }
        trainJourney.setTrain(train);

       Optional<Station> bId = stationRepository.findById(stationId);
       Station station = null;
       if(bId.isPresent()){
         station = bId.get();
       } else {
           System.out.println("no user found with this id "+stationId);
       }
       trainJourney.setStation(station);

        Train_Journey save = trainJourneyRepository.save(trainJourney);
        return save;
    }
}
