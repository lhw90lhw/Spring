package di.constructor.basic;

public class InsaImpl implements Insa {
	MemberDAO dao;
	
	
	// 	1. �����̳ʰ� insaImpl�� ������ �� dao��ü�� ������ �� �� �ֵ��� �����ڸ� ����
	
	public InsaImpl() {
		
	}
	
	public InsaImpl(MemberDAO dao) {
		super();
		this.dao = dao;
		System.out.println("dao ������ ȣ��(Injection)");
	}

	@Override
	public void addUser(MemberDTO user) {
		dao.add(user);		
	}

	@Override
	public MemberDTO getUser(String id) {
		dao.getUser("id");
		return null;
	}

}
