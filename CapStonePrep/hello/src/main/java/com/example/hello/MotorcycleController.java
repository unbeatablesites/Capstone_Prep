package com.example.hello;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class MotorcycleController {

    @RequestMapping(value = "/motorcycles",method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public Motorcycle createMotorcycle(@RequestBody Motorcycle motorcycle){

        return motorcycle;
    }

}
