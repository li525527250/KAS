package cn.com.broad.dao;

import java.util.List;

import cn.com.broad.entity.StaffKpiIndex;
/*
 * 某员工KPI指标详情类接口
 * */
public interface StaffKpiIndexDao {
	//通过员工编号查询某员工的KPI指标详情
	public List<StaffKpiIndex> getStaffKpiIndexByStaffBobNumber(String staffBobNumber);
}
