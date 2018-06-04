package cn.com.broad.dao;

import java.util.List;

import cn.com.broad.entity.Posts;

public interface PostsDao {
	public boolean addPost(Posts posts);// ���һ����λ

	public boolean deletePost(int postID);// �ϳ�һ����λ

	public boolean updatePost(Posts posts);// �޸�һ����λ

	public List<Posts> getAllPost();// ��ѯ���и�λ
	
	public List<Posts> getPostByDepartmentId(int departmentID);//ͨ��һ������ID��ѯ����λ
}
