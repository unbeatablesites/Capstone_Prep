package com.example.hello;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Random;

@RestController
public class MotorcycleController {

    @RequestMapping(value = "/motorcycles",method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public Motorcycle createMotorcycle(@RequestBody Motorcycle motorcycle){

        Random randomId = new Random();

        motorcycle.setId(randomId.nextInt(11));

        return motorcycle;
    }

    @RequestMapping(value = "/motorcycle/{motoId}",method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Motorcycle getMotoById(@PathVariable int motoId){

        if(motoId < 1){throw new IllegalArgumentException(" The id must be greater than 0");
        }

        Motorcycle moto = new Motorcycle();

        moto.setId(motoId);
        moto.setVin("33339");
        moto.setMake("LandRover");
        moto.setModel("Discovery");
        moto.setYear("2001");
        moto.setColor("Gold");

        return moto;

    }

    @RequestMapping(value = "/motorcycle/{motoId}",method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void deleteMotorcycle(@PathVariable int motoId){

        if(motoId < 0 ){throw new IllegalArgumentException("Please enter a number greater than 0");}

    }


    @RequestMapping(value = "/motorcycle/{motoId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateMoto(@RequestBody Motorcycle motorcycle, @PathVariable int motoId){}

}
