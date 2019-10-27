package com.example.hello;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class EchoRangeService {


    @RequestMapping(value = "/echoRange/{num}",method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public int getEcho(@PathVariable int num){

        if(num > 10 || num < 1){ throw new IllegalArgumentException("You did not enter a number between 1 and 10 inclusive");
        }
        return num ;
    }

}
