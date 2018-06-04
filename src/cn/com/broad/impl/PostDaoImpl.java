package cn.com.broad.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import cn.com.broad.dao.BaseDao;
import cn.com.broad.dao.PostsDao;
import cn.com.broad.entity.Department;
import cn.com.broad.entity.Posts;

/*
 * ��λʵ�� ��
 * */
public class PostDaoImpl implements PostsDao {
	// ���һ����λ
	@Override
	public boolean addPost(Posts posts) {
		// TODO Auto-generated method stub
		String sql = "insert into posts VALUES(null,?,?)";
		Object[] args = new Object[] { posts.getPostName(), posts.getDepartmentID() };
		return BaseDao.executeUpdate(sql, args);
	}

	// ɾ��һ����λ
	@Override
	public boolean deletePost(int postID) {
		// TODO Auto-generated method stub
		String sql = "DELETE from posts where posts.postID=?";
		Object[] args = new Object[] { postID };
		return BaseDao.executeUpdate(sql, args);
	}

	// ͨ��һ����λID�޸������λ�����ƺͲ���
	@Override
	public boolean updatePost(Posts posts) {
		// TODO Auto-generated method stub
		String sql = "UPDATE posts p set p.postName=?,p.departmentID=? WHERE p.postID=?";
		Object[] args = new Object[] { posts.getPostName(), posts.getDepartmentID(), posts.getPostID() };
		return BaseDao.executeUpdate(sql, args);
	}

	// ��ѯ�����еĸ�λ
	@Override
	public List<Posts> getAllPost() {
		// TODO Auto-generated method stub
		List<Posts> list = new ArrayList<Posts>();
		String sql = "SELECT * from posts";
		Connection con = BaseDao.conn();
		Statement psta = null;
		ResultSet rs = null;
		try {
			psta = con.createStatement();
			rs = psta.executeQuery(sql);
			while (rs.next()) {
				Posts posts = new Posts();
				posts.setPostID(rs.getInt(1));
				posts.setPostName(rs.getString(2));
				posts.setDepartmentID(rs.getInt(3));
				list.add(posts);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}

	// ͨ��һ������ID��ѯ��������ŵ�����Ա��
	@Override
	public List<Posts> getPostByDepartmentId(int departmentID) {
		// TODO Auto-generated method stub
		List<Posts> list = new ArrayList<Posts>();
		String sql = "SELECT * from posts where departmentID=?";
		Connection con = BaseDao.conn();
		PreparedStatement psta = null;
		ResultSet rs = null;
		try {
			psta = con.prepareStatement(sql);
			psta.setInt(1, departmentID);
			rs = psta.executeQuery();
			while (rs.next()) {
				Posts posts = new Posts();
				posts.setPostID(rs.getInt(1));
				posts.setPostName(rs.getString(2));
				posts.setDepartmentID(rs.getInt(3));
				list.add(posts);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}

}
