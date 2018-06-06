package cn.com.broad.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import cn.com.broad.dao.BaseDao;
import cn.com.broad.dao.UserDao;
import cn.com.broad.entity.Users;

/*
 * �û�ʵ����
 * */
public class UsersDaoImpl implements UserDao {

	// ���һ���û�
	@Override
	public boolean addUser(Users users) {
		// TODO Auto-generated method stub
		String sql = "insert into users VALUES(null,?,?,?)";
		Object[] args = new Object[] { users.getUserName(), users.getUserPassword(), users.getAuthorityID() };
		return BaseDao.executeUpdate(sql, args);
	}

	// ͨ��һ���û�IDɾ��ĳһ���û�
	@Override
	public boolean deleteUser(int userID) {
		// TODO Auto-generated method stub
		String sql = "DELETE FROM users where users.userID=?";
		Object[] args = new Object[] { userID };
		return BaseDao.executeUpdate(sql, args);
	}

	// ͨ��ĳһ���û�ID�޸�����û�������
	@Override
	public boolean updateUserpwd(Users users) {
		// TODO Auto-generated method stub
		String sql = "update users u set u.userPassword WHERE u.userID=? ";
		Object[] args = new Object[] { users.getUserPassword(), users.getUserID() };
		return BaseDao.executeUpdate(sql, args);
	}

	// ͨ���˺������¼�û�
	@Override
	public boolean loginUser(Users users) {
		// TODO Auto-generated method stub
		boolean flag = false;
		String sql = "SELECT * from users WHERE userName=? and userPassword=?";
		Connection con = BaseDao.conn();
		PreparedStatement psta = null;
		ResultSet rs = null;
		try {
			psta = con.prepareStatement(sql);
			psta.setString(1, users.getUserName());
			psta.setString(2, users.getUserPassword());
			rs = psta.executeQuery();
			while (rs.next()) {
				flag = true;
				return flag;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return flag;
	}

}
