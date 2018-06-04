package cn.com.broad.dao;

import java.util.List;

import cn.com.broad.entity.Staffscore;

public interface StaffScoreDao {
	public boolean addStaffScore(Staffscore staffscore);// 添加一个员工得分

	public boolean deleteStaffScore(int staffID);// 删除一个员工得分

	public boolean updateStaffScore(Staffscore staff);// 修改一个员工得分

	public List<Staffscore> getAllStaffScore();// 查询所有员工得分
	
	public Staffscore getStaffscoreByStaffID(String staffjobnumber);//通过一个岗位ID查询出这个岗位的员工
}
