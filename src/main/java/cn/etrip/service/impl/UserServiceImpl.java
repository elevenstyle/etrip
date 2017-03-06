package cn.etrip.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.etrip.entity.User;
import cn.etrip.mapper.UserMapper;
import cn.etrip.service.UserService;
@Service
@Transactional
@Scope("prototype")
public class UserServiceImpl implements UserService{
	@Autowired
	private UserMapper userMapper;

	@Override
	public User getUserInfo(String email) {
		User user = userMapper.getUserInfo(email);
		return user;
	}

	@Override
	public int insertUser(User user) {
		return userMapper.insertUser(user);
	}

}
