package cn.com.broad.dao;

import java.util.List;

import cn.com.broad.entity.Company;

public interface companyDao {
	public boolean addCompany(Company companyVO);// 添加公司信息接口

	public boolean updateCompany(Company companyVO);// 修改公司信息接口

	public List<Company> getCompanyAll();//查询出所有的公司

	public boolean deleteCompanyByID(String companyID);// 根据ID删除单个公司信息（非物理删除-实际操作为修改公司状态）
}
