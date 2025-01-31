package br.com.helio.SpringFrameworkPractice.services.openv;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"dev", "default"})
@Service
public class DevEnvServiceImpl implements EnvService {
    @Override
    public String getEnv() {  return "dev env";  }
}
