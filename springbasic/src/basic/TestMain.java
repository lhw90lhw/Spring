package basic;

public class TestMain {
	public static void main(String[] args) {
		//1. 생성자를 통해서 MemberDAO객체를 전달(생성자를 통해서 객체를 주입했다.)
		MemberDAO dao = new MemberDAO();
		Insa insa = new InsaImpl(dao);
		
		//2. MemberDAO객체를 전달(setter메소드를 통해 객체를 주입)
		InsaImpl insa2 = new InsaImpl();
		insa2.setDao(dao);
		MemberDTO user = new MemberDTO("jang","1234","장동건");
		String name = new String("이민호");
		user.setName(name);
		insa.addUser(user);
		insa2.addUser(user);

	}

}
