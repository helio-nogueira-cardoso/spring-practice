package br.com.helio.SpringFrameworkPractice.controllers;

import br.com.helio.SpringFrameworkPractice.services.GreetingService;
import br.com.helio.SpringFrameworkPractice.services.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

@Controller // This is now important for dependency injection and inversion of control
public class MyController {
    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello() {
        System.out.println("I am inside the hello method of the MyController class.");
        return greetingService.greet();
    }
}
