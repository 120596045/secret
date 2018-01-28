package com.service;

import com.entity.User;

/**
 * 用户表
 * @author Administrator
 *
 */
public interface UserService {

	/**
	 * 通过uid获取用户
	 */
	public User getUserByUid(Integer uid);
	/**
	 * 通过邮箱查询用户
	 * 
	 */
	public User getUserByUemal(String uEmail);
	/**
	 * 通过对象添加
	 * @param record
	 * @return
	 */
	int insert(User record);
    /**
     * 添加
     * @param record
     * @return
     */
    int insertSelective(User record);
    User selectByPrimaryKey(Integer uId);
}