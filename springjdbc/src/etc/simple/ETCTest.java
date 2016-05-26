package etc.simple;

import myemp.MyEmpDTO;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ETCTest {

	public static void main(String[] args) {
		ApplicationContext container = 
				new ClassPathXmlApplicationContext("config/etc.xml");
		MyEmpDAOETCImpl dao = (MyEmpDAOETCImpl)container.getBean("simpledao");
		dao.insert(new MyEmpDTO("kyle@", "1234", "불광", "1등급", "이현우"));
		

	}

}
