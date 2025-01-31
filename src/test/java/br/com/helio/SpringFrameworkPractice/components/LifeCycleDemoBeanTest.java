package br.com.helio.SpringFrameworkPractice.components;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LifeCycleDemoBeanTest {

    @Autowired
    LifeCycleDemoBean lcBean;

    @Test
    void lifeCycleTest() {
        lcBean.customMethod();
    }
}