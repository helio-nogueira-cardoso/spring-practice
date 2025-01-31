package br.com.helio.SpringFrameworkPractice.controllers;

import br.com.helio.SpringFrameworkPractice.services.GreetingService;
import br.com.helio.SpringFrameworkPractice.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller // This is now important for dependency injection and inversion of control
public class MyController {
    private final GreetingService greetingService;

    public MyController(@Qualifier("greetingServiceImpl") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello() {
        System.out.println("I am inside the hello method of the MyController class.");
        return greetingService.greet();
    }

    public void beforeInit() {
        System.out.println("## - Before Init - Called by Bean Post Processor");
    }

    public void afterInit() {
        System.out.println("## - After Init - Called by Bean Post Processor");
    }
}
