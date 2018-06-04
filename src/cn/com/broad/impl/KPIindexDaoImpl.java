package cn.com.broad.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import cn.com.broad.dao.BaseDao;
import cn.com.broad.dao.KPIindexDao;
import cn.com.broad.entity.Kpiindex;

/*
 * KPI指标实现类
 * 
 * */
public class KPIindexDaoImpl implements KPIindexDao {
	// 添加一个KPI指标
	@Override
	public boolean addKPIindex(Kpiindex kpiindex) {
		// TODO Auto-generated method stub
		String sql = "insert into module VALUES(null,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		Object[] args = new Object[] { kpiindex.getKpiIndexName(), kpiindex.getModuleID(), kpiindex.getPostID(),
				kpiindex.getWeight(), kpiindex.getSpan(), kpiindex.getIndexDefinition(), kpiindex.getDateSources(),
				kpiindex.getComputationalFormula(), kpiindex.getAnnualObjectives(), kpiindex.getQuarterlyAccounting(),
				kpiindex.getCurrentTarget(), kpiindex.getCurrentReality(), kpiindex.getCurrentYieldRate(),
				kpiindex.getCurrentScore() };
		return BaseDao.executeUpdate(sql, args);
	}

	// 通过一个KPI指标ID删除一个KPI指标
	@Override
	public boolean deleteKPIindex(int kpiindexID) {
		// TODO Auto-generated method stub
		String sql = "DELETE from kpiindex where kpiindex.KPAIndexID=?";
		Object[] args = new Object[] { kpiindexID };
		return BaseDao.executeUpdate(sql, args);
	}

	// 通过一个KPI指标ID修改一个KPI指标
	@Override
	public boolean updateKPIindex(Kpiindex kpiindex) {
		// TODO Auto-generated method stub
		String sql = "UPDATE kpiindex k set k.KPAIndexName=?,k.moduleID=?,k.postID=?,"
				+ "k.weight=?,k.span=?,k.indexDefinition,k.dateSources=?,k.computationalFormula=?,"
				+ "k.annualObjectives=?,k.quarterlyAccounting=?,k.currentTarget=?,k.currentReality=?,"
				+ "k.currentYieldRate=?,k.currentScore=? where k.KPAIndexID=?";
		Object[] args = new Object[] { kpiindex.getKpiIndexName(), kpiindex.getModuleID(), kpiindex.getPostID(),
				kpiindex.getWeight(), kpiindex.getSpan(), kpiindex.getIndexDefinition(), kpiindex.getDateSources(),
				kpiindex.getComputationalFormula(), kpiindex.getAnnualObjectives(), kpiindex.getQuarterlyAccounting(),
				kpiindex.getCurrentTarget(), kpiindex.getCurrentReality(), kpiindex.getCurrentYieldRate(),
				kpiindex.getCurrentScore(), kpiindex.getKpiIndexID() };
		return BaseDao.executeUpdate(sql, args);
	}

	// 查询出所有的KPI指标详细
	@Override
	public List<Kpiindex> getAllKPIindex() {
		// TODO Auto-generated method stub
		List<Kpiindex> list = new ArrayList<Kpiindex>();
		String sql = "SELECT * from kpiindex";
		Connection con = BaseDao.conn();
		Statement psta = null;
		ResultSet rs = null;
		try {
			psta = con.createStatement();
			rs = psta.executeQuery(sql);
			while (rs.next()) {
				Kpiindex k = new Kpiindex();
				k.setKpiIndexID(rs.getInt(1));
				k.setKpiIndexName(rs.getString(2));
				k.setModuleID(rs.getInt(3));
				k.setPostID(rs.getInt(4));
				k.setWeight(rs.getString(5));
				k.setSpan(rs.getString(6));
				k.setIndexDefinition(rs.getString(7));
				k.setDateSources(rs.getString(8));
				k.setComputationalFormula(rs.getString(9));
				k.setAnnualObjectives(rs.getString(10));
				k.setQuarterlyAccounting(rs.getString(11));
				k.setCurrentTarget(rs.getString(12));
				k.setCurrentReality(rs.getString(13));
				k.setCurrentYieldRate(rs.getString(14));
				k.setCurrentScore(rs.getString(15));
				list.add(k);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}

	// 通过某一个岗位ID查询出该岗位的KPI指标详细
	@Override
	public List<Kpiindex> getKPIindexByPostID(int postID) {
		// TODO Auto-generated method stub
		List<Kpiindex> list = new ArrayList<Kpiindex>();
		String sql = "SELECT * from Kpiindex where postID=?";
		Connection con = BaseDao.conn();
		PreparedStatement psta = null;
		ResultSet rs = null;
		try {
			psta = con.prepareStatement(sql);
			psta.setInt(1, postID);
			rs = psta.executeQuery();
			while (rs.next()) {
				Kpiindex k = new Kpiindex();
				k.setKpiIndexID(rs.getInt(1));
				k.setKpiIndexName(rs.getString(2));
				k.setModuleID(rs.getInt(3));
				k.setPostID(rs.getInt(4));
				k.setWeight(rs.getString(5));
				k.setSpan(rs.getString(6));
				k.setIndexDefinition(rs.getString(7));
				k.setDateSources(rs.getString(8));
				k.setComputationalFormula(rs.getString(9));
				k.setAnnualObjectives(rs.getString(10));
				k.setQuarterlyAccounting(rs.getString(11));
				k.setCurrentTarget(rs.getString(12));
				k.setCurrentReality(rs.getString(13));
				k.setCurrentYieldRate(rs.getString(14));
				k.setCurrentScore(rs.getString(15));
				list.add(k);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}

}
