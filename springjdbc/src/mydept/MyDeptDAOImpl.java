package mydept;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class MyDeptDAOImpl implements MyDeptDAO {
	private JdbcTemplate template;

	
	public MyDeptDAOImpl() {
	}
	
	public MyDeptDAOImpl(JdbcTemplate template) {
		super();
		this.template = template;
	}

	@Override
	public int count() {
		return template.queryForObject("select count(*) from mydept",
										Integer.class);
	}

	@Override
	public void insert(MyDeptDTO dept) {
		String sql = "insert into mydept values(?,?,?,?)";
		
		int result = template.update(sql, 
						dept.getDeptno(), dept.getDeptname(),
						dept.getLoc(), dept.getTellnum());
		System.out.println(result+"개 삽입성공");
	}

	@Override
	public void update(MyDeptDTO deptInfo) {
		String sql = "update mydept set deptname=?, telnum=? "
					+ "where deptno=?";
		int result = template.update(sql, deptInfo.getDeptname(),
				deptInfo.getTellnum(),deptInfo.getDeptno());
		System.out.println(result+"개 삽입성공");

	}

	@Override
	public void delete(String deptno) {
		String sql = "delete from mydept where deptno = ?";
		int result = template.update(sql, deptno);
		System.out.println(result+"개 부서 삭제성공");
	}

	@Override
	public List<MyDeptDTO> getDeptList() {
		String sql = "select * from mydept";
		return 
			template.query(sql, new MyDeptRowMapper());
	}
	@Override
	public MyDeptDTO findByDeptno(String deptno) {
		String sql = "select * from mydept where deptno = ?";
		MyDeptDTO dept = template.queryForObject(sql, new Object[]{deptno}, 
													new MyDeptRowMapper());
		return dept;
	}

	@Override
	public List<MyEmpDTO> findByDeptname(String deptname) {
		String sql = "select e.* from mydept d, myemp e "
					+ "where d.deptname like ? and d.deptno = e.deptno";
		List<MyEmpDTO> emplist = template.query(sql, new Object[]{deptname+"%"}, 
													new MyEmpRowMapper());
		return emplist;
	}
}
