package entity;

/*
 * Ա����λ��
 * */
public class Posts {
	private int postID;// ��λID
	private String postName;// ��λ����
	private String departmentID;// ����ID

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

	public String getDepartmentID() {
		return departmentID;
	}

	public void setDepartmentID(String departmentID) {
		this.departmentID = departmentID;
	}

	public Posts(int postID, String postName, String departmentID) {
		super();
		this.postID = postID;
		this.postName = postName;
		this.departmentID = departmentID;
	}

	public Posts() {
		super();
	}

}
