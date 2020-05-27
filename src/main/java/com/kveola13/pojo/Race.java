package com.kveola13.pojo;

import org.springframework.stereotype.Component;

@Component
public class Race {
    String name;
    int UId;

    public Race() {
    }

    public Race(String name, int UId) {
        this.name = name;
        this.UId = UId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUId() {
        return UId;
    }

    public void setUId(int UId) {
        this.UId = UId;
    }

    @Override
    public String toString() {
        return "Race{" +
                "name='" + name + '\'' +
                ", UId=" + UId +
                '}';
    }

    public String init(){
        return "Race added";
    }
}
