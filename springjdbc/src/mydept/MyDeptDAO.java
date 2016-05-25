package mydept;

import java.util.List;

public interface MyDeptDAO {
	//�μ����� ��ȸ
	int count();
	//�μ����
	void insert(MyDeptDTO dept);
	//�μ���������
	void update(MyDeptDTO deptInfo);
	//�μ�����
	void delete(String deptno);
	//�μ���Ϻ���
	List<MyDeptDTO> getDeptList();
	//�μ���ġ�� �˻�
	List<MyDeptDTO> findByLoc(String loc);
	
}









