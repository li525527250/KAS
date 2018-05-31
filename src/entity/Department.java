package entity;

/*
 * 部门表
 * */
public class Department {
	private int departmentID;// 部门ID
	private String depaertmantName;// 部门名称

	public int getDepartmentID() {
		return departmentID;
	}

	public void setDepartmentID(int departmentID) {
		this.departmentID = departmentID;
	}

	public String getDepaertmantName() {
		return depaertmantName;
	}

	public void setDepaertmantName(String depaertmantName) {
		this.depaertmantName = depaertmantName;
	}

	public Department(int departmentID, String depaertmantName) {
		super();
		this.departmentID = departmentID;
		this.depaertmantName = depaertmantName;
	}

	public Department() {
		super();
	}

}
