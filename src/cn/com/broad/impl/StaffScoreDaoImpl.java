package cn.com.broad.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import cn.com.broad.dao.BaseDao;
import cn.com.broad.dao.StaffScoreDao;
import cn.com.broad.entity.Staffscore;

/*
 * Ա���÷�ʵ����
 * */
public class StaffScoreDaoImpl implements StaffScoreDao {
	// ���һ��Ա���÷�
	@Override
	public boolean addStaffScore(Staffscore staffscore) {
		// TODO Auto-generated method stub
		String sql = "insert into staffscore VALUES(null,?,?,?,?)";
		Object[] args = new Object[] { staffscore.getStaffJobNumber(), staffscore.getStaffScore(),
				staffscore.getStartDate(), staffscore.getEndDate() };
		return BaseDao.executeUpdate(sql, args);
	}

	// ͨ��һ��Ա���÷�IDɾ��һ��Ա���÷ּ�¼
	@Override
	public boolean deleteStaffScore(int staffID) {
		// TODO Auto-generated method stub
		String sql = "DELETE from staffscore WHERE staffscore.staffScoreID=?";
		Object[] args = new Object[] { staffID };
		return BaseDao.executeUpdate(sql, args);
	}

	// ͨ��һ��Ա���÷�ID�޸�һ��Ա���÷ּ�¼
	@Override
	public boolean updateStaffScore(Staffscore staff) {
		// TODO Auto-generated method stub
		String sql = "UPDATE staffscore s set s.staffScore=? WHERE s.staffScoreID=?";
		Object[] args = new Object[] { staff.getStaffScore(), staff.getStaffScoreID() };
		return BaseDao.executeUpdate(sql, args);
	}

	// ��ѯ�����е÷ּ�¼
	@Override
	public List<Staffscore> getAllStaffScore() {
		// TODO Auto-generated method stub
		List<Staffscore> list = new ArrayList<Staffscore>();
		String sql = "SELECT * from staffscore";
		Connection con = BaseDao.conn();
		Statement psta = null;
		ResultSet rs = null;
		try {
			psta = con.createStatement();
			rs = psta.executeQuery(sql);
			while (rs.next()) {
				Staffscore staffscore = new Staffscore();
				staffscore.setStaffScoreID(rs.getInt(1));
				staffscore.setStaffJobNumber(rs.getString(2));
				staffscore.setStaffScore(rs.getInt(3));
				staffscore.setStartDate(rs.getString(4));
				staffscore.setEndDate(rs.getString(5));
				list.add(staffscore);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}

	// ͨ��һ��Ա�����Ų�ѯ�����Ա���÷�
	@Override
	public Staffscore getStaffscoreByStaffID(String staffjobnumber) {
		// TODO Auto-generated method stub
		Staffscore staffscore = new Staffscore();
		String sql = "SELECT * from staffscore where staffJobNumber=?";
		Connection con = BaseDao.conn();
		PreparedStatement psta = null;
		ResultSet rs = null;
		try {
			psta = con.prepareStatement(sql);
			psta.setString(1, staffjobnumber);
			rs = psta.executeQuery();
			while (rs.next()) {
				staffscore.setStaffScoreID(rs.getInt(1));
				staffscore.setStaffJobNumber(rs.getString(2));
				staffscore.setStaffScore(rs.getInt(3));
				staffscore.setStartDate(rs.getString(4));
				staffscore.setEndDate(rs.getString(5));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return staffscore;
	}
}
