package cn.com.broad.dao;

import java.util.List;

import cn.com.broad.entity.StaffKpiIndex;
/*
 * ĳԱ��KPIָ��������ӿ�
 * */
public interface StaffKpiIndexDao {
	//ͨ��Ա����Ų�ѯĳԱ����KPIָ������
	public List<StaffKpiIndex> getStaffKpiIndexByStaffBobNumber(String staffBobNumber);
}
