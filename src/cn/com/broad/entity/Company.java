package cn.com.broad.entity;

/*
 * ��˾��
 * */
public class Company {
	private int companyID;// ��˾ID
	private String companyName;// ��˾����
	private int ifDelete;//�Ƿ�ɾ��0-��1-��  --------����

	public int getIfDelete() {
		return ifDelete;
	}

	public void setIfDelete(int ifDelete) {
		this.ifDelete = ifDelete;
	}

	public int getCompanyID() {
		return companyID;
	}

	public void setCompanyID(int companyID) {
		this.companyID = companyID;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Company(int companyID, String companyName,int ifDelete) {
		super();
		this.companyID = companyID;
		this.companyName = companyName;
		this.ifDelete=ifDelete;
	}

	public Company() {
		super();
	}

}
