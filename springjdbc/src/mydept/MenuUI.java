package mydept;

import java.util.List;
import java.util.Scanner;

public class MenuUI implements AbstractUI {
	Scanner key = new Scanner(System.in);
	MyDeptDAO dao;

	public MenuUI() {
	}
	
	public MenuUI(MyDeptDAO dao) {
		super();
		this.dao = dao;
	}
	
	//시작을 알리는 메소드
	public void show(){
		System.out.println("**********회원관리 시스템************");
		System.out.println("1. 부서등록");
		System.out.println("2. 부서정보수정");
		System.out.println("3. 부서삭제");
		System.out.println("4. 부서목록보기");
		System.out.println("5. 부서정보조회");
		System.out.println("6. 부서별사원조회");
		System.out.println("7. 부서개수조회");
		System.out.println("8. 종료");
		System.out.print("원하는 작업을 선택하세요:");
		int menu=key.nextInt();
		menuSelect(menu);
	}
	//show에서 선택한 값을 넘겨받아서 각각의 메소드를 선택하는 역할을 하는 메소드
	public void menuSelect(int menu){
		switch(menu){
			case 1:
				insertMenu();
				break;
			case 2:
				updateMenu();
				break;
			case 3:
				deleteMenu();
				break;
			case 4:
				showAllMenu();
				break;
			case 5:
				findByDeptnoMenu();
				break;
			case 6:
				SelectByDeptnameMenu();
				break;
			case 7:
				countMenu();
				break;
			case 8:
				System.exit(0);
		}
	}
	

	@Override
	public void deleteMenu() {
		System.out.println("******삭제*******");
		System.out.println("삭제할 부서코드를 입력하세요:");
		String deptno = key.next();
		dao.delete(deptno);

	}

	@Override
	public void findByDeptnoMenu() {
		System.out.println("********검색********");
		System.out.print("검색할 부서코드를 입력하세요:");
		String deptno = key.next();
		List<MyDeptDTO> deptlist = dao.findByDeptno(deptno);
		for (int i = 0; i < deptlist.size(); i++) {
			MyDeptDTO dept = deptlist.get(i);
			System.out.print(dept.getDeptno()+"\t");
			System.out.print(dept.getDeptname()+"\t");
			System.out.print(dept.getLoc()+"\t");
			System.out.print(dept.getTellnum()+"\t");
		}
	}

	@Override
	public void SelectByDeptnameMenu() {
		System.out.println("********검색********");
		System.out.print("검색할 부서명을 입력하세요:");
		String deptname = key.next();
		List<MyEmpDTO> emplist = dao.findByDeptname(deptname);
		for (int i = 0; i < emplist.size(); i++) {
			MyEmpDTO user = emplist.get(i);
			System.out.print(user.getId()+"\t");
			System.out.print(user.getPass()+"\t");
			System.out.print(user.getName()+"\t");
			System.out.print(user.getAddr()+"\t");
			System.out.print(user.getGrade()+"\t");
			System.out.println(user.getDeptno()+"\t");
		}
	}	
	
	@Override
	public void insertMenu() {
		System.out.println("********부서등록********");
		System.out.print("부서코드:");
		String deptno = key.next();
		System.out.print("부서명:");
		String deptname = key.next();
		System.out.print("부서위치:");
		String loc = key.next();
		System.out.print("전화번호:");
		String tellnum = key.next();
		MyDeptDTO dept
			= new MyDeptDTO(deptno, deptname, loc, tellnum);
		dao.insert(dept);

	}

	@Override
	public void showAllMenu() {
		
		List<MyDeptDTO> deptlist = dao.getDeptList();
		System.out.println("dao의 메소드 호출 후");
		for (int i = 0; i < deptlist.size(); i++) {
			MyDeptDTO dept = deptlist.get(i);
			System.out.print(dept.getDeptno()+"\t");
			System.out.print(dept.getDeptname()+"\t");
			System.out.print(dept.getLoc()+"\t");
			System.out.println(dept.getTellnum()+"\t");
		}

	}

	@Override
	public void updateMenu() {
		System.out.println("********부서정보수정********");
		System.out.print("부서코드:");
		String deptno = key.next();
		System.out.print("부서명:");
		String deptname = key.next();
		System.out.print("전화번호:");
		String tellnum = key.next();
		MyDeptDTO updatedept
			= new MyDeptDTO(deptno, deptname, null, tellnum);
		dao.update(updatedept);
		

	}
	@Override
	public void countMenu() {
		System.out.println("전체 부서개수: "+dao.count());
		
	}



}








