package br.com.helio.SpringFrameworkPractice.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class GreetingServicePrimaryImpl implements GreetingService {
    @Override
    public String greet() {
        return "Hello, everyone! - Primary";
    }
}
