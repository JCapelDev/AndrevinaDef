package com.example.empty1;

import android.net.Uri;

import java.security.PrivateKey;

public class record{
    public record() {

    }

    public record(String name , Integer points, Uri fileUri) {
        this.setName(name);
        this.setPoints(points);
        this.setFileUri(fileUri);
    }

    private String Name;
    private Integer Points;
    private Double Time;
    private Uri fileUri;



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

    public Uri getFileUri() {
        return fileUri;
    }

    public void setFileUri(Uri fileUri) {
        this.fileUri = fileUri;
    }
}
