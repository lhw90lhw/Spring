package di.setter.basic;

public class InsaImpl implements Insa {
	MemberDAO dao;
	
	
	// 	1. 컨테이너가 insaImpl을 생성할 때 dao객체를 전달해 줄 수 있도록 생성자를 정의
	
	public InsaImpl() {
		
	}
	
	public InsaImpl(MemberDAO dao) {
		super();
		this.dao = dao;
		System.out.println("dao 생성자 호출(Injection)");
	}

	
	
	public MemberDAO getDao() {
		return dao;
	}

	public void setDao(MemberDAO dao) {
		this.dao = dao;
		System.out.println("setter메소드");
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
