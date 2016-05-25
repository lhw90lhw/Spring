package di.setter.basic;

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

	
	
	public MemberDAO getDao() {
		return dao;
	}

	public void setDao(MemberDAO dao) {
		this.dao = dao;
		System.out.println("setter�޼ҵ�");
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
