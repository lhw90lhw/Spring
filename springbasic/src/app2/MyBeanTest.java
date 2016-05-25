package app2;
/*
 * 	결합도가 극도로 높은 프로그램
 * 	==> 클래스가 결합도가 강하고 의존이 높다. 사용되어지는 클래스가 변경되면
 * 		수정되어야 하는 범위가 넓어진다.
 * 		즉, 사용하는 클래스를 모두 다 변경해야함(oop특성 적용 x)
 *	oop특성을 적용하여 상위타입으로 정의했으므로 하위 클래스가 변경되는 경우는 수정하지 않아도 된다.
 *	실제 객체를 생성해서 전달하는 부분은 여전히 수정해야 한다. (MyBeanEN이 MyBeanKO로 변경되는 부분)
 */
public class MyBeanTest{
	public static void main(String[] args) {
		MyBean obj = new MyBeanKO();
		test1(obj);
		test2(obj);
	}
	public static void test1(MyBean obj){
		//MyBeanKO클래스를 2번사용
		obj.sayHello("장동건");
		obj.sayHello("장동건");
	}
	public static void test2(MyBean obj){
		//MyBeanKO클래스를 3번사용
		obj.sayHello("장동건");
		obj.sayHello("장동건");
		obj.sayHello("장동건");
	}
}
