package cn.com.broad.entity;

/*
 * 员工岗位表
 * */
public class Posts {
	private int postID;// 岗位ID
	private String postName;// 岗位名称
	private int departmentID;// 部门ID
	private int ifDelete;//是否删除0-否、1-是  --------新增

	public int getIfDelete() {
		return ifDelete;
	}

	public void setIfDelete(int ifDelete) {
		this.ifDelete = ifDelete;
	}

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

	public Posts(int postID, String postName, int departmentID,int ifdelete) {
		super();
		this.postID = postID;
		this.postName = postName;
		this.departmentID = departmentID;
		this.ifDelete=ifdelete;
	}

	public Posts() {
		super();
	}

}
