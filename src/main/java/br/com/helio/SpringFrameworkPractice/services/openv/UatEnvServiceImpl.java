package br.com.helio.SpringFrameworkPractice.services.openv;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("uat")
@Service
public class UatEnvServiceImpl implements EnvService {
    @Override
    public String getEnv() {
        return "uat env";
    }
}
