package br.com.helio.SpringFrameworkPractice.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest // Let's use Spring Framework now to inject the dependency
class ConstructorInjectedControllerTest {
    @Autowired // Let's use Spring Framework now to inject the dependency
     ConstructorInjectedController constructorInjectedController;

    @Test
    void sayHello() {
        System.out.println(constructorInjectedController.sayHello());
    }
}