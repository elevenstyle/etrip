package cn.etrip.mapper;

import cn.etrip.entity.User;

public interface UserMapper {
	public User getUserInfo(String name);
	int insertUser(User user);
}
