package br.com.helio.SpringFrameworkPractice.services.openv;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("qa")
@Service
public class QaEnvServiceImpl implements EnvService {
    @Override
    public String getEnv() {
        return "qa env";
    }
}
