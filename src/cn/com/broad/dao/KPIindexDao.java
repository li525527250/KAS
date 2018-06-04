package cn.com.broad.dao;

import java.util.List;

import cn.com.broad.entity.Kpiindex;
import cn.com.broad.entity.Staffscore;

public interface KPIindexDao {
	public boolean addKPIindex(Kpiindex kpiindex);// 添加一个员工KPI

	public boolean deleteKPIindex(int kpiindexID);// 删除一个员工KPI

	public boolean updateKPIindex(Kpiindex kpiindex);// 修改一个员工KPI

	public List<Kpiindex> getAllKPIindex();// 查询所有员工KPI
	
	public List<Kpiindex> getKPIindexByPostID(int postID);//通过一个岗位ID查询出这个岗位的KPI
}
