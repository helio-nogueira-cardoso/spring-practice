package br.com.helio.SpringFrameworkPractice.controllers.openv;

import br.com.helio.SpringFrameworkPractice.services.openv.EnvService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class EnvStringController {
    private final EnvService envService;

    public EnvStringController(EnvService envService) {
        this.envService = envService;
    }

    public String whichEnv() {
        return "You are in " + envService.getEnv() + " Environment!";
    }
}
