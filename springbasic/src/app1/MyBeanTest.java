package app1;
/*
 * 	���յ��� �ص��� ���� ���α׷�
 * 	==> Ŭ������ ���յ��� ���ϰ� ������ ����. ���Ǿ����� Ŭ������ ����Ǹ�
 * 		�����Ǿ�� �ϴ� ������ �о�����.
 * 		��, ����ϴ� Ŭ������ ��� �� �����ؾ���(oopƯ�� ���� x)
 *
 */
public class MyBeanTest {
	public static void main(String[] args) {
		MyBeanKO obj = new MyBeanKO();
		test1(obj);
		test2(obj);
	}
	
	public static void test1(MyBeanKO obj){
		//MyBeanKOŬ������ 2�����
		obj.sayHello("�嵿��");
		obj.sayHello("�嵿��");
	}
	public static void test2(MyBeanKO obj){
		//MyBeanKOŬ������ 3�����
		obj.sayHello("�嵿��");
		obj.sayHello("�嵿��");
		obj.sayHello("�嵿��");
	}

}
