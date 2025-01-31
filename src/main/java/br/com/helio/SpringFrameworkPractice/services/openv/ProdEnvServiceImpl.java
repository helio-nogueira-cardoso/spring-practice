package br.com.helio.SpringFrameworkPractice.services.openv;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("prod")
@Service
public class ProdEnvServiceImpl implements EnvService {
    @Override
    public String getEnv() {
        return "prod env";
    }
}
