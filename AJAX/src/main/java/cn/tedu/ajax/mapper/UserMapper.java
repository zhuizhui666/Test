package cn.tedu.ajax.mapper;

import cn.tedu.ajax.entity.User;

public interface UserMapper {
	Integer insert(User user);
	User findByName(String username);
}
