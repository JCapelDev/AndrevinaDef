package com.example.empty1;

import java.security.PrivateKey;

public class record{
    public record() {

    }

    public record(String name, Double time , Integer points) {
        Name = name;
        Time = time;
        Points = points;
    }

    private String Name;
    private Integer Points;
    private Double Time;



    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getPoints() {
        return Points;
    }

    public void setPoints(Integer points) {
        Points = points;
    }

    public Double getTime() {
        return Time;
    }

    public void setTime(Double time) {
        Time = time;
    }


}
