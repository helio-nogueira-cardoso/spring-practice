package br.com.helio.SpringFrameworkPractice;

import br.com.helio.SpringFrameworkPractice.controllers.MyController;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.TestConstructor;

@SpringBootTest
@TestConstructor(autowireMode = TestConstructor.AutowireMode.ALL)
class SpringFrameworkPracticeApplicationTests {
	private final ApplicationContext applicationContext;
	private final MyController myController;

	public SpringFrameworkPracticeApplicationTests(ApplicationContext applicationContext, MyController myController) {
		this.applicationContext = applicationContext;
		this.myController = myController;
	}

	@Test
	void testGetControllerFromCtx() {
		MyController myController = applicationContext.getBean(MyController.class);
		System.out.println(myController.hello());
	}

	@Test
	void testGetControllerDirectlyFromInjection() {
		System.out.println(myController.hello());
	}

	@Test
	void contextLoads() {
	}

}
