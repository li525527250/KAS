package cn.com.broad.dao;

import java.util.List;

import cn.com.broad.entity.Department;

public interface DepartmentDao {
	public boolean addDepartment(Department department);// ��Ӳ���

	public boolean deleteDepartment(int departmentID);// ɾ������

	public boolean updateDepartment(Department department);// �޸Ĳ���

	public List<Department> getDepertmentAll();// ��ѯ���в���
	
	public List<Department> getDepertmentByCompanyID(int companyID);//ͨ����˾ID����ĳ����˾��ӵ�еĲ���
}
