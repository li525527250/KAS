package cn.com.broad.entity;

/*
 * Ա����λ��
 * */
public class Posts {
	private int postID;// ��λID
	private String postName;// ��λ����
	private int departmentID;// ����ID

	public int getPostID() {
		return postID;
	}

	public void setPostID(int postID) {
		this.postID = postID;
	}

	public String getPostName() {
		return postName;
	}

	public void setPostName(String postName) {
		this.postName = postName;
	}

	public int getDepartmentID() {
		return departmentID;
	}

	public void setDepartmentID(int departmentID) {
		this.departmentID = departmentID;
	}

	public Posts(int postID, String postName, int departmentID) {
		super();
		this.postID = postID;
		this.postName = postName;
		this.departmentID = departmentID;
	}

	public Posts() {
		super();
	}

}
