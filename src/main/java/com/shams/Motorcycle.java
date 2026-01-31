package com.shams;

public class Motorcycle {
    private String make;
    private String model;
    private int year;
    public Motorcycle(String make, String model, int year) {
        this.make = make;
        this.model = model;

    }
    public String getMake() {
         return make;
    }
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}

