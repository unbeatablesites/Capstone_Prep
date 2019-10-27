package com.example.hello;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Motorcycle {

    private int id;
    @NotEmpty(message = "The vin must be 5 Characters")
    @Size(max = 5, min = 5, message = "vin must be 5 characters in length. ")
    private String vin;
    @NotEmpty(message = "PLs enter a Make")
    private String make;
    @NotEmpty(message = "PLs enter a Model")
    private String model;
    @NotEmpty(message = "PLs enter a Year")
    private String year;
    @NotEmpty(message = "PLs enter a Color")
    private String color;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
