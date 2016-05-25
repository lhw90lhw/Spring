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
	
	//������ �˸��� �޼ҵ�
	public void show(){
		System.out.println("**********ȸ������ �ý���************");
		System.out.println("1. �μ����");
		System.out.println("2. �μ���������");
		System.out.println("3. �μ�����");
		System.out.println("4. �μ���Ϻ���");
		System.out.println("5. �μ������� ȸ���˻��ϱ�");
		System.out.println("6. �μ�������ȸ");
		System.out.println("7. ����");
		System.out.print("���ϴ� �۾��� �����ϼ���:");
		int menu=key.nextInt();
		menuSelect(menu);
	}
	//show���� ������ ���� �Ѱܹ޾Ƽ� ������ �޼ҵ带 �����ϴ� ������ �ϴ� �޼ҵ�
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
				findByLocMenu();
				break;
			case 6:
				countMenu();
				break;
			case 7:
				System.exit(0);
		}
	}
	@Override
	public void deleteMenu() {
		System.out.println("******����*******");
		System.out.println("������ �μ��ڵ带 �Է��ϼ���:");
		String deptno = key.next();
		dao.delete(deptno);

	}

	@Override
	public void findByLocMenu() {
		System.out.println("********�˻�********");
		System.out.print("�˻��� �ּҸ� �Է��ϼ���:");
		String loc = key.next();
		List<MyDeptDTO> deptlist = dao.findByLoc(loc);
		for (int i = 0; i < deptlist.size(); i++) {
			MyDeptDTO dept = deptlist.get(i);
			System.out.print(dept.getDeptno()+"\t");
			System.out.print(dept.getDeptname()+"\t");
			System.out.print(dept.getLoc()+"\t");
			System.out.print(dept.getTellnum()+"\t");
		}
	}

	@Override
	public void insertMenu() {
		System.out.println("********�μ����********");
		System.out.print("�μ��ڵ�:");
		String deptno = key.next();
		System.out.print("�μ���:");
		String deptname = key.next();
		System.out.print("�μ���ġ:");
		String loc = key.next();
		System.out.print("��ȭ��ȣ:");
		String tellnum = key.next();
		MyDeptDTO dept
			= new MyDeptDTO(deptno, deptname, loc, tellnum);
		dao.insert(dept);

	}

	@Override
	public void showAllMenu() {
		
		List<MyDeptDTO> deptlist = dao.getDeptList();
		System.out.println("dao�� �޼ҵ� ȣ�� ��");
		for (int i = 0; i < deptlist.size(); i++) {
			MyDeptDTO dept = deptlist.get(i);
			System.out.print(dept.getDeptno()+"\t");
			System.out.print(dept.getDeptname()+"\t");
			System.out.print(dept.getLoc()+"\t");
			System.out.print(dept.getTellnum()+"\t");
		}

	}

	@Override
	public void updateMenu() {
		System.out.println("********�μ���������********");
		System.out.print("�μ��ڵ�:");
		String deptno = key.next();
		System.out.print("�μ���:");
		String deptname = key.next();
		System.out.print("��ȭ��ȣ:");
		String tellnum = key.next();
		MyDeptDTO updatedept
			= new MyDeptDTO(deptno, deptname, null, tellnum);
		dao.update(updatedept);
		

	}
	@Override
	public void countMenu() {
		System.out.println("��ü �μ�����: "+dao.count());
		
	}

}








