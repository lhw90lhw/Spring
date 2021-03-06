package di.constructor03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestApp {

	public static void main(String[] args) {
		ApplicationContext container = 
				new	ClassPathXmlApplicationContext("config/bean.xml");
		InterMessage bean = (InterMessage)container.getBean("bean");
		bean.sayHello();
	}

}
