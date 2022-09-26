package com.example.hellotyhmeleaf.controller;

import com.example.hellotyhmeleaf.entity.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

@Controller
@Slf4j
public class ApplicationController {

    @RequestMapping(path = "/",method = RequestMethod.GET)
    public String index(Model model){
        model.addAttribute("text","hello World");
        model.addAttribute("time",new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime()));

        List<Student> students = List.of(
                new Student("Halil","K"),
                new Student("van","dijk")
        );


        model.addAttribute("students",students);


        return  "index";
    }
}
