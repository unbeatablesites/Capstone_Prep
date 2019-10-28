package com.example.hello.model;

import com.example.hello.Temprature;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

@RestController
public class WeatherServiceController {

    @RequestMapping(value = "/temprature/{zipCode}",method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Temprature getTemp(@PathVariable String zipCode) {
        if (zipCode.length() != 5) {
            throw new IllegalArgumentException("Zip code must be 5 characters long");
        }


        Random rnd = new Random();
        Temprature temp = new Temprature();

        temp.setFahrenheit(rnd.nextInt(140) - 20);
        double celsiusTemp = (temp.getFahrenheit() - 32) *  5/9;
        temp.setCelsius((int) celsiusTemp);
        return temp;
    }

}
