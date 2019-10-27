package com.example.hello;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloServiceController {

    @RequestMapping(value = "/name/{name}",method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public String whatsYourName(@PathVariable String name){
        return "It's really nice to meet you " + name + " !";
    }

}
