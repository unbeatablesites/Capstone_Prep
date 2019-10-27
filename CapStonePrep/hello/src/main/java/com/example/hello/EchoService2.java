package com.example.hello;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class EchoService2 {

    @RequestMapping(value = "/What/{wys}",method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public String repeatAString(@PathVariable String wys){

        return wys;

    }

}
