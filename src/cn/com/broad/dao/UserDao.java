package cn.com.broad.dao;

import cn.com.broad.entity.Users;

public interface UserDao {
	public boolean addUser(Users users);// ����û��ӿ�

	public boolean deleteUser(int userID);// ɾ���û��ӿ�

	public boolean updateUserpwd(Users users);// �޸��û�����

	public boolean loginUser(Users users);// �û���¼
}
