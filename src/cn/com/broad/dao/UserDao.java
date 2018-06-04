package cn.com.broad.dao;

import cn.com.broad.entity.Users;

public interface UserDao {
	public boolean addUser(Users users);// 添加用户接口

	public boolean deleteUser(int userID);// 删除用户接口

	public boolean updateUserpwd(Users users);// 修改用户密码

	public boolean loginUser(Users users);// 用户登录
}
