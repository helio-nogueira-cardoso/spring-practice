package br.com.helio.SpringFrameworkPractice.controllers.openv;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

// Default profile is only active when there is no other profile active
// So you must set it up for each profile set, even if not using it
@SpringBootTest
@ActiveProfiles({"uat", "EN"})
class UatEnvStringControllerTest {
    @Autowired
    private EnvStringController envStringController;

    @Test
    void whichEnv() {
        System.out.println(envStringController.whichEnv());
    }
}