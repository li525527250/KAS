package cn.com.broad.dao;

import java.util.List;

import cn.com.broad.entity.Company;

public interface companyDao {
	public boolean addCompany(Company companyVO);// ��ӹ�˾��Ϣ�ӿ�

	public boolean updateCompany(Company companyVO);// �޸Ĺ�˾��Ϣ�ӿ�

	public List<Company> getCompanyAll();//��ѯ�����еĹ�˾

	public boolean deleteCompanyByID(String companyID);// ����IDɾ��������˾��Ϣ��������ɾ��-ʵ�ʲ���Ϊ�޸Ĺ�˾״̬��
}
