package etc.named;

import myemp.MyEmpDTO;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ETCTest {

	public static void main(String[] args) {
		ApplicationContext container = 
				new ClassPathXmlApplicationContext("config/etc.xml");
		MyEmpDAOETCImpl dao = (MyEmpDAOETCImpl)container.getBean("namedao");
		dao.insert(new MyEmpDTO("yang1", "1234", "구파발", "3등급", "양성민"));
		

	}

}
