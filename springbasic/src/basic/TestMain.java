package basic;

public class TestMain {
	public static void main(String[] args) {
		//1. �����ڸ� ���ؼ� MemberDAO��ü�� ����(�����ڸ� ���ؼ� ��ü�� �����ߴ�.)
		MemberDAO dao = new MemberDAO();
		Insa insa = new InsaImpl(dao);
		
		//2. MemberDAO��ü�� ����(setter�޼ҵ带 ���� ��ü�� ����)
		InsaImpl insa2 = new InsaImpl();
		insa2.setDao(dao);
		MemberDTO user = new MemberDTO("jang","1234","�嵿��");
		String name = new String("�̹�ȣ");
		user.setName(name);
		insa.addUser(user);
		insa2.addUser(user);

	}

}
