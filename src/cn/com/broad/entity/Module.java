package cn.com.broad.entity;

/*
 * ģ�ͱ�
 * */
public class Module {
	private int moduleID;// ģ��ID
	private String moduleName;// ģ������
	private int postID;// ��λID
	private int ifDelete;//�Ƿ�ɾ��0-��1-��  --------����

	public int getIfDelete() {
		return ifDelete;
	}

	public void setIfDelete(int ifDelete) {
		this.ifDelete = ifDelete;
	}

	public int getModuleID() {
		return moduleID;
	}

	public void setModuleID(int moduleID) {
		this.moduleID = moduleID;
	}

	public String getModuleName() {
		return moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}

	public int getPostID() {
		return postID;
	}

	public void setPostID(int postID) {
		this.postID = postID;
	}

	public Module(int moduleID, String moduleName, int postID,int ifdelete) {
		super();
		this.moduleID = moduleID;
		this.moduleName = moduleName;
		this.postID = postID;
		this.ifDelete=ifdelete;
	}

	public Module() {
		super();
	}

}
