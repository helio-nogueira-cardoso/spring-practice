package br.com.helio.SpringFrameworkPractice;

import br.com.helio.SpringFrameworkPractice.controllers.MyController;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class SpringFrameworkPracticeApplicationTests {
	private final ApplicationContext applicationContext;

	public SpringFrameworkPracticeApplicationTests(ApplicationContext applicationContext) {
		this.applicationContext = applicationContext;
	}

	@Test
	void testGetControllerFromCtx() {
		MyController myController = applicationContext.getBean(MyController.class);
		System.out.println(myController.hello());
	}

	@Test
	void contextLoads() {
	}

}
