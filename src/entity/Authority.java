package entity;

/*
 * �û�Ȩ�ޱ�
 * */
public class Authority {
	private int authorityID;// Ȩ��ID
	private String authorityName;// Ȩ������

	public int getAuthorityID() {
		return authorityID;
	}

	public void setAuthorityID(int authorityID) {
		this.authorityID = authorityID;
	}

	public String getAuthorityName() {
		return authorityName;
	}

	public void setAuthorityName(String authorityName) {
		this.authorityName = authorityName;
	}

	public Authority(int authorityID, String authorityName) {
		super();
		this.authorityID = authorityID;
		this.authorityName = authorityName;
	}

	public Authority() {
		super();
	}

}
