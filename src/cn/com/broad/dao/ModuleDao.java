package cn.com.broad.dao;

import java.util.List;

import cn.com.broad.entity.Module;

public interface ModuleDao {
	public boolean addModule(Module module);// ���һ��ģ��

	public boolean deleteModule(int moduleID);// �ϳ�һ��ģ��

	public boolean updateModule(Module module);// �޸�һ��ģ��

	public List<Module> getAllModule();// ��ѯ����ģ��

	public List<Module> getModuleByPostID(int postId);// ͨ��ĳ����λ��ѯ�����ڸ�λ��ģ��
}
