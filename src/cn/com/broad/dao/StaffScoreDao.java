package cn.com.broad.dao;

import java.util.List;

import cn.com.broad.entity.Staffscore;

public interface StaffScoreDao {
	public boolean addStaffScore(Staffscore staffscore);// ���һ��Ա���÷�

	public boolean deleteStaffScore(int staffID);// ɾ��һ��Ա���÷�

	public boolean updateStaffScore(Staffscore staff);// �޸�һ��Ա���÷�

	public List<Staffscore> getAllStaffScore();// ��ѯ����Ա���÷�
	
	public Staffscore getStaffscoreByStaffID(String staffjobnumber);//ͨ��һ����λID��ѯ�������λ��Ա��
}
