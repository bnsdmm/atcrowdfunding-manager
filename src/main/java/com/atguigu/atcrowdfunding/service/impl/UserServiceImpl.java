package com.atguigu.atcrowdfunding.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.atcrowdfunding.bean.User;
import com.atguigu.atcrowdfunding.dao.UserDao;
import com.atguigu.atcrowdfunding.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userdao;

	public List<User> queryAll() {
		return userdao.queryAll();
	}
}
