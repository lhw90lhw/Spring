package secondexam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScottTest {
	public static void main(String[] args) {
		ApplicationContext container =
				new ClassPathXmlApplicationContext("config/scott.xml");
		ScottDAO dao = (ScottDAO)container.getBean("dao");
		System.out.println("deptno=10�� ������ => " + dao.count());
	}
}