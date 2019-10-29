package com.example.hello;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
//Calculator api
@RestController
public class calculatorController {

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public int add(@RequestBody CalculatorObject calculatorObject){
    return calculatorObject.getOperand1() + calculatorObject.getOperand2();
    }

    @RequestMapping(value = "/subtract",method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public int sub(@RequestBody CalculatorObject calculatorObject){
        return calculatorObject.getOperand1() - calculatorObject.getOperand2();
    }

    @RequestMapping(value = "/multi",method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public int multipy(@RequestBody CalculatorObject calculatorObject){
        return calculatorObject.getOperand1() *calculatorObject.getOperand2();
    }

    @RequestMapping(value = "/divide",method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public float divide(@RequestBody CalculatorObject calculatorObject){
        return calculatorObject.getOperand1() / calculatorObject.getOperand2();
    }

}
