package br.com.helio.SpringFrameworkPractice.controllers.openv;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DefaultEnvStringControllerTest {
    @Autowired
    private EnvStringController envStringController;

    @Test
    void whichEnv() {
        System.out.println(envStringController.whichEnv());
    }
}