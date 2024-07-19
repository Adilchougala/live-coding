package com.gblogdemoapp.dto;


import java.util.Date;

public class TrainDto {
    private Long id;

    private String name;
    private Date date;
    private String addedTrain;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getAddedTrain() {
        return addedTrain;
    }

    public void setAddedTrain(String addedTrain) {
        this.addedTrain = addedTrain;
    }
}
