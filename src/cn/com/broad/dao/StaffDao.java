package cn.com.broad.dao;

import java.util.List;

import cn.com.broad.entity.Staff;

public interface StaffDao {
	public boolean addStaff(Staff staff);// ���һ��Ա��

	public boolean deleteStaff(int staffID);// ɾ��һ��Ա��

	public boolean updateStaff(Staff staff);// �޸�һ��Ա��

	public List<Staff> getAllStaff();// ��ѯ����Ա��
	
	public List<Staff> getStaffByPostID(int postId);//ͨ��һ����λID��ѯ�������λ��Ա��
}
