package br.com.helio.SpringFrameworkPractice.controllers;

import br.com.helio.SpringFrameworkPractice.services.GreetingService;

public class PropertyInjectedController {
    public GreetingService greetingService;

    public String sayHello() {
        return greetingService.greet();
    }
}
