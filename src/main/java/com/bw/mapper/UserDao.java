package com.bw.mapper;

import java.util.List;

import com.bw.entity.User;

/**
 * @author 武文浩
 *
 * 2019年9月4日
 */
public interface UserDao {

	List<User> findAllUser();

}
