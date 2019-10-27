package com.example.hello;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    List<Student> studentList = new ArrayList<>();

    public StudentController(){

        studentList.add(new Student("Sam"));
        studentList.add(new Student("Frank"));
        studentList.add(new Student("Katie"));
        studentList.add(new Student("Mike"));
    }

    @RequestMapping(value = "student",method = RequestMethod.GET)
    public List<Student> getStudentList(){return studentList;}

    @RequestMapping(value = "student/{index}",method = RequestMethod.GET)
    public Student getStudentByIndex(@PathVariable int index){return studentList.get(index);}


}
