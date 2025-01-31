package br.com.helio.SpringFrameworkPractice.services;

import org.springframework.stereotype.Service;

@Service("setterInjectedGreetingService")
public class GreetingServiceSetterInjectedImpl implements GreetingService {
    @Override
    public String greet() {
        return "Hey I am using setter injection!";
    }
}
