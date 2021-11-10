package com.example.This.is.Drivers.Project.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculator_controller {

    @RequestMapping("/Addition")
    public int add(){
        int result = 123+456;
        return result;
    }

    @RequestMapping("/Multiplication")
    public int multiply(){
        int result = 123*456;
        return result;
    }

    @RequestMapping("/Substraction")
    public int subs(){
        int result = 1000-456;
        return result;
    }

    @RequestMapping("/Division")
    public int divide(){
        int result = 12345/456;
        return result;
    }

    @RequestMapping("/Add.")
    public double plus(){
        double result = 100.0+200.0;
        return result;
    }

    @RequestMapping("/Subs.")
    public double sub(){
        double result = 1000.0-200.0;
        return result;
    }


    @RequestMapping("/Into")
    public double mult(){
        double result = 100.0*200.0;
        return result;
    }


    @RequestMapping("/Divide")
    public double guna(){
        double result = 10000.0/200.0;
        return result;
    }


}
