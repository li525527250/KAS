package cn.com.broad.dao;

import java.util.List;

import cn.com.broad.entity.Staff;

public interface StaffDao {
	public boolean addStaff(Staff staff);// 添加一个员工

	public boolean deleteStaff(int staffID);// 删除一个员工

	public boolean updateStaff(Staff staff);// 修改一个员工

	public List<Staff> getAllStaff();// 查询所有员工
	
	public List<Staff> getStaffByPostID(int postId);//通过一个岗位ID查询出这个岗位的员工
}
