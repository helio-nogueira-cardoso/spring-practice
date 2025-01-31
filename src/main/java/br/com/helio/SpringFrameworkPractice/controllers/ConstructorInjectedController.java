package br.com.helio.SpringFrameworkPractice.controllers;

import br.com.helio.SpringFrameworkPractice.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller // Let's use Spring Framework now to inject the dependency
public class ConstructorInjectedController {
    private final GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.greet();
    }
}
