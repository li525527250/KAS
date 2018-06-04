package cn.com.broad.dao;

import java.util.List;

import cn.com.broad.entity.Department;

public interface DepartmentDao {
	public boolean addDepartment(Department department);// 添加部门

	public boolean deleteDepartment(int departmentID);// 删除部门

	public boolean updateDepartment(Department department);// 修改部门

	public List<Department> getDepertmentAll();// 查询所有部门
	
	public List<Department> getDepertmentByCompanyID(int companyID);//通过公司ID查找某个公司所拥有的部门
}
