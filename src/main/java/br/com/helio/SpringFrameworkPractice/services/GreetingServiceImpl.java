package br.com.helio.SpringFrameworkPractice.services;

import org.springframework.stereotype.Service;

@Service //Important now for dependency injection and inversion of control
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String greet() {
        return "Hello, everyone!";
    }
}
