package cn.com.broad.entity;

/*
 * 模型表
 * */
public class Module {
	private int moduleID;// 模板ID
	private String moduleName;// 模板描述
	private int postID;// 岗位ID

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

	public Module(int moduleID, String moduleName, int postID) {
		super();
		this.moduleID = moduleID;
		this.moduleName = moduleName;
		this.postID = postID;
	}

	public Module() {
		super();
	}

}
