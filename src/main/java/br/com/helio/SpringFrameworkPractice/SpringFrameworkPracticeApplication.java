package br.com.helio.SpringFrameworkPractice;

import br.com.helio.SpringFrameworkPractice.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringFrameworkPracticeApplication {
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringFrameworkPracticeApplication.class, args);
		MyController myController = ctx.getBean(MyController.class);
		System.out.println("In main method!");
		System.out.println(myController.hello());
	}
}
