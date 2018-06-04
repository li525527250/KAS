package cn.com.broad.dao;

import java.util.List;

import cn.com.broad.entity.Posts;

public interface PostsDao {
	public boolean addPost(Posts posts);// 添加一个岗位

	public boolean deletePost(int postID);// 上除一个岗位

	public boolean updatePost(Posts posts);// 修改一个岗位

	public List<Posts> getAllPost();// 查询所有岗位
	
	public List<Posts> getPostByDepartmentId(int departmentID);//通过一个部门ID查询出岗位
}
