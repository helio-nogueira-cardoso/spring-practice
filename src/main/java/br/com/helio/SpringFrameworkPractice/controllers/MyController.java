package br.com.helio.SpringFrameworkPractice.controllers;

import br.com.helio.SpringFrameworkPractice.services.GreetingService;
import br.com.helio.SpringFrameworkPractice.services.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    private final GreetingService greetingService;

    public MyController() {
        this.greetingService = new GreetingServiceImpl(); // Bad practice. We should use dependency injection.
    }

    public String hello() {
        System.out.println("I am inside the hello method of the MyController class.");
        return greetingService.greet();
    }
}
