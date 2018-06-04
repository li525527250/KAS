package cn.com.broad.dao;

import java.util.List;

import cn.com.broad.entity.Module;

public interface ModuleDao {
	public boolean addModule(Module module);// 添加一个模板

	public boolean deleteModule(int moduleID);// 上除一个模板

	public boolean updateModule(Module module);// 修改一个模板

	public List<Module> getAllModule();// 查询所有模板

	public List<Module> getModuleByPostID(int postId);// 通过某个岗位查询出所在岗位的模板
}
