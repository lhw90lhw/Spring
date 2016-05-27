package emp.dao;

import java.util.List;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import emp.dto.MyEmpDTO;
import emp.dto.MyEmpRowMapper;

public class MyEmpDAOImpl implements MyEmpDAO {
	private JdbcTemplate template;

	
	public MyEmpDAOImpl() {
	}
	
	public MyEmpDAOImpl(JdbcTemplate template) {
		super();
		this.template = template;
	}

	@Override
	public int count() {
		return template.queryForObject("select count(*) from myemp",
										Integer.class);
	}

	@Override
	public void insert(MyEmpDTO user) {
		String sql = "insert into myemp values(?,?,?,1000,?,'013',?)";
		
		int result = template.update(sql, 
						user.getId(),user.getPass(),user.getAddr(),
						user.getGrade(),user.getName());
		System.out.println(result+"개 삽입성공");
	}

	@Override
	public void update(MyEmpDTO userInfo) {
		String sql = "update myemp set pass=?, addr=?, grade=? where id=?";
		int result = template.update(sql, userInfo.getPass(),
						userInfo.getAddr(),userInfo.getGrade(),userInfo.getId());
		System.out.println(result+"개 삽입성공");

	}

	@Override
	public void delete(String id) {
		String sql = "delete from myemp where id = ?";
		int result = template.update(sql, id);
		System.out.println(result+"개 삭제성공");
	}

	@Override
	public MyEmpDTO login(String id, String pass) {
		String sql = "select * from myemp where id = ? and pass = ?";
		MyEmpDTO loginUser = null;
		try{
		loginUser = template.queryForObject(sql, new Object[]{id, pass}, new MyEmpRowMapper());
		}catch(EmptyResultDataAccessException e){
			
		}
		return loginUser;
	}

	@Override
	public List<MyEmpDTO> getMemberList() {
		String sql = "select * from myemp";
		return template.query(sql, new MyEmpRowMapper());
	}

	@Override
	public List<MyEmpDTO> findByAddr(String addr) {
		String sql = "select * from myemp where addr like ?";
		List<MyEmpDTO> emplist = template.query(sql, new Object[]{"%"+addr+"%"},
												new MyEmpRowMapper());
		return emplist;
	}

}
