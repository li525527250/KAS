package cn.com.broad.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import cn.com.broad.dao.BaseDao;
import cn.com.broad.dao.companyDao;
import cn.com.broad.entity.Company;

/*
 * 公司实现类
 * */
public class CompanyDaoImpl implements companyDao {
	// 添加一个公司
	@Override
	public boolean addCompany(Company companyVO) {
		// TODO Auto-generated method stub
		String sql = "insert into company VALUES(null,?)";
		Object[] args = new Object[] { companyVO.getCompanyName() };
		return BaseDao.executeUpdate(sql, args);
	}

	// 通过一个用户ID修改一个公司名称
	@Override
	public boolean updateCompany(Company companyVO) {
		// TODO Auto-generated method stub
		String sql = "update company set companyName=? where companyID=? ";
		Object[] args = new Object[] { companyVO.getCompanyName(), companyVO.getCompanyID() };
		return BaseDao.executeUpdate(sql, args);
	}

	@Override
	public boolean deleteCompanyByID(String companyID) {
		// TODO Auto-generated method stub
		String sql = "DELETE FROM company WHERE company.companyID=?";
		Object[] args = new Object[] { companyID };
		return BaseDao.executeUpdate(sql, args);
	}

	// 查询出所有的公司
	@Override
	public List<Company> getCompanyAll() {
		// TODO Auto-generated method stub
		List<Company> list = new ArrayList<Company>();
		String sql = "select * from company";
		Connection con = BaseDao.conn();
		Statement psta = null;
		ResultSet rs = null;
		try {
			psta = con.createStatement();
			rs = psta.executeQuery(sql);
			while (rs.next()) {
				Company company = new Company();
				company.setCompanyID(rs.getInt(1));
				company.setCompanyName(rs.getString(2));
				list.add(company);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}

}
