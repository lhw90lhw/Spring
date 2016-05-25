package app3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * 	���յ��� �ص��� ���� ���α׷�
 * 	==> Ŭ������ ���յ��� ���ϰ� ������ ����. ���Ǿ����� Ŭ������ ����Ǹ�
 * 		�����Ǿ�� �ϴ� ������ �о�����.
 * 		��, ����ϴ� Ŭ������ ��� �� �����ؾ���(oopƯ�� ���� x)
 *	oopƯ���� �����Ͽ� ����Ÿ������ ���������Ƿ� ���� Ŭ������ ����Ǵ� ���� �������� �ʾƵ� �ȴ�.
 *	���� ��ü�� �����ؼ� �����ϴ� �κ��� ������ �����ؾ� �Ѵ�. (MyBeanEN�� MyBeanKO�� ����Ǵ� �κ�)
 */
public class MyBeanTest2{
	public static void main(String[] args) {
		ApplicationContext factory = 
				new ClassPathXmlApplicationContext("config/bean.xml");
		MyBean obj = (MyBean)factory.getBean("obj");
		test1(obj);
		test2(obj);
	}
	public static void test1(MyBean obj){
		//MyBeanKOŬ������ 2�����
		obj.sayHello("�嵿��");
		obj.sayHello("�嵿��");
	}
	public static void test2(MyBean obj){
		//MyBeanKOŬ������ 3�����
		obj.sayHello("�嵿��");
		obj.sayHello("�嵿��");
		obj.sayHello("�嵿��");
	}
}
