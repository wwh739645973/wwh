package com.bw.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bw.entity.User;
import com.bw.mapper.UserDao;

/**
 * @author 武文浩
 *
 * 2019年9月4日
 */
@Service
public class UserServiceImpl implements UserService{

	@Resource
	private UserDao dao;
	
	public List<User> findAllUser() {
		return dao.findAllUser();
	}

}
