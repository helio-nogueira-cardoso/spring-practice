package br.com.helio.SpringFrameworkPractice.services;

import org.springframework.stereotype.Service;

@Service("greetingWithPropertyInjection")
public class GreetingServiceInjectedImpl implements GreetingService {
    @Override
    public String greet() {
        return "Don't let friends down for not using dependency injection!";
    }
}
