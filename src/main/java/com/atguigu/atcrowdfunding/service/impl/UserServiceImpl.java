package com.atguigu.atcrowdfunding.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.atcrowdfunding.bean.User;
import com.atguigu.atcrowdfunding.dao.UserDao;
import com.atguigu.atcrowdfunding.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDaoao;

	public List<User> queryAll() {
		return userDaoao.queryAll();
	}

	public User query4login(User user) {
		// TODO Auto-generated method stub
		return userDaoao.query4login(user);
	}

	public List<User> pageQueryData(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return userDaoao.pageQueryData(map);
	}

	public int pageQueryCount(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return userDaoao.pageQueryCount(map);
	}

	public void insertUser(User user) {
		userDaoao.insertUser(user);
	}
}
