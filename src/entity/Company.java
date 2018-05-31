package entity;

/*
 * 公司表
 * */
public class Company {
	private int companyID;// 公司ID
	private String companyName;// 公司名称

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

	public Company(int companyID, String companyName) {
		super();
		this.companyID = companyID;
		this.companyName = companyName;
	}

	public Company() {
		super();
	}

}
