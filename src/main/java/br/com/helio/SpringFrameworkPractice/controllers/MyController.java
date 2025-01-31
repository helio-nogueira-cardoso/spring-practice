package br.com.helio.SpringFrameworkPractice.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    public String hello() {
        System.out.println("I am inside the hello method of the MyController class.");
        return "Saying Hello World!";
    }
}
