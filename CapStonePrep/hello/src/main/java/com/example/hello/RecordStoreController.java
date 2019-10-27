package com.example.hello;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RecordStoreController {

    private List<Record> recordList;

    private static int idCounter = 1;

    public RecordStoreController() {

        recordList = new ArrayList<>();
//
        recordList.add(new Record("The Beach Boys1", "Pet Sounds1", idCounter++));
        recordList.add(new Record("The Beach Boys2", "Pet Sounds2", idCounter++));
        recordList.add(new Record("The Beach Boys3", "Pet Sounds3", idCounter++));
        recordList.add(new Record("The Beach Boys4", "Pet Sounds4", idCounter++));
    }

    @RequestMapping(value = "/records", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    public Record createRecord(@RequestBody Record record) {
        record.setNum(idCounter);
        recordList.add(record);

        return record;


    }

    @RequestMapping(value = "/records", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public List<Record>  getAllRecords() {

        return recordList;
    }

    @RequestMapping(value = "/records/{num}",method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Record getOneRecord(@PathVariable int num ){
        return recordList.get(num);
    }

    @RequestMapping(value = "/records/{num}",method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void deleteRecord(@PathVariable int num){
        
    }
}
