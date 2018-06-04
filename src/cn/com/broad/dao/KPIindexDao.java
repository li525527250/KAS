package cn.com.broad.dao;

import java.util.List;

import cn.com.broad.entity.Kpiindex;
import cn.com.broad.entity.Staffscore;

public interface KPIindexDao {
	public boolean addKPIindex(Kpiindex kpiindex);// ���һ��Ա��KPI

	public boolean deleteKPIindex(int kpiindexID);// ɾ��һ��Ա��KPI

	public boolean updateKPIindex(Kpiindex kpiindex);// �޸�һ��Ա��KPI

	public List<Kpiindex> getAllKPIindex();// ��ѯ����Ա��KPI
	
	public List<Kpiindex> getKPIindexByPostID(int postID);//ͨ��һ����λID��ѯ�������λ��KPI
}
