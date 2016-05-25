package mydept;


public class MyDeptDTO{
	private String deptno;
	private String deptname;
	private String loc;
	private String tellnum;
	
	public MyDeptDTO(){
		
	}

	public MyDeptDTO(String deptno, String deptname, String loc, String tellnum) {
		super();
		this.deptno = deptno;
		this.deptname = deptname;
		this.loc = loc;
		this.tellnum = tellnum;
	}

	public String getDeptno() {
		return deptno;
	}

	public void setDeptno(String deptno) {
		this.deptno = deptno;
	}

	public String getDeptname() {
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public String getTellnum() {
		return tellnum;
	}

	public void setTellnum(String tellnum) {
		this.tellnum = tellnum;
	}
	
	
	
	
}
