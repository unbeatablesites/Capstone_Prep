package com.example.hello;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class DayConverterServiceController {

    @RequestMapping(value = "/day/{number}",method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.CREATED)
    public String convertDay(@PathVariable int number) {

        String day ="";

        switch (number) {
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            case 7:
                day = "Sunday";
                break;
            default:
                throw new IllegalArgumentException("Please enter a name between 1 and 7");
        }
    return day;
    }
}