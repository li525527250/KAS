package cn.com.broad.entity;

/*
 * ���ű�
 * */
public class Department {
	private int departmentID;// ����ID
	private String depaertmantName;// ��������
	private int companyID;

	public int getCompanyID() {
		return companyID;
	}

	public void setCompanyID(int companyID) {
		this.companyID = companyID;
	}

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

	public Department(int departmentID, String depaertmantName,int companyID) {
		super();
		this.departmentID = departmentID;
		this.depaertmantName = depaertmantName;
		this.companyID=companyID;
	}

	public Department() {
		super();
	}

}
