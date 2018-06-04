package cn.com.broad.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import cn.com.broad.dao.BaseDao;
import cn.com.broad.dao.ModuleDao;
import cn.com.broad.entity.Module;

/*
 * mģ��ʵ����
 * */
public class MobuleDaoImpl implements ModuleDao {
	// ���ģ��
	@Override
	public boolean addModule(Module module) {
		// TODO Auto-generated method stub
		String sql = "insert into module VALUES(null,?,?)";
		Object[] args = new Object[] { module.getModuleName(), module.getPostID() };
		return BaseDao.executeUpdate(sql, args);
	}

	// ͨ��һ��ģ��IDɾ��һ��ģ��
	@Override
	public boolean deleteModule(int moduleID) {
		// TODO Auto-generated method stub
		String sql = "DELETE from module WHERE module.moduleID=?";
		Object[] args = new Object[] { moduleID };
		return BaseDao.executeUpdate(sql, args);
	}

	// ͨ��һ��ģ��ID�޸�һ��ģ��
	@Override
	public boolean updateModule(Module module) {
		// TODO Auto-generated method stub
		String sql = "update module set moduleName=?,postID=? WHERE moduleID=?";
		Object[] args = new Object[] { module.getModuleName(), module.getPostID(), module.getModuleID() };
		return BaseDao.executeUpdate(sql, args);
	}

	// ��ѯ�����е�ģ��
	@Override
	public List<Module> getAllModule() {
		// TODO Auto-generated method stub
		List<Module> list = new ArrayList<Module>();
		String sql = "SELECT * from module";
		Connection con = BaseDao.conn();
		Statement psta = null;
		ResultSet rs = null;
		try {
			psta = con.createStatement();
			rs = psta.executeQuery(sql);
			while (rs.next()) {
				Module module = new Module();
				module.setModuleID(rs.getInt(1));
				module.setModuleName(rs.getString(2));
				module.setPostID(rs.getInt(3));
				list.add(module);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}

	// ͨ��һ����λID��ѯ���ø�λ����ģ��
	@Override
	public List<Module> getModuleByPostID(int postId) {
		// TODO Auto-generated method stub
		List<Module> list = new ArrayList<Module>();
		String sql = "SELECT * from module where postID=?";
		Connection con = BaseDao.conn();
		PreparedStatement psta = null;
		ResultSet rs = null;
		try {
			psta = con.prepareStatement(sql);
			psta.setInt(1, postId);
			rs = psta.executeQuery();
			while (rs.next()) {
				Module module = new Module();
				module.setModuleID(rs.getInt(1));
				module.setModuleName(rs.getString(2));
				module.setPostID(rs.getInt(3));
				list.add(module);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}
}
