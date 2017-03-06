package cn.etrip.service;

import cn.etrip.entity.User;

public interface UserService {
	User getUserInfo(String email);
	int insertUser(User user);
}
