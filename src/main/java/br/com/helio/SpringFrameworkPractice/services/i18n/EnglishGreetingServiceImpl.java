package br.com.helio.SpringFrameworkPractice.services.i18n;

import br.com.helio.SpringFrameworkPractice.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("i18nService")
public class EnglishGreetingServiceImpl implements GreetingService {
    @Override
    public String greet() {
        return "Hello World - EN";
    }
}
