package com.demohot.blogs.mapper;

import org.apache.ibatis.annotations.Param;

import com.demohot.blogs.model.User;

public interface UserMapper {
	void insert(User user);

	void select();

	boolean login(String username, String password);

	User getByUsernameAndPassword(@Param("username") String username, @Param("password") String password);
}
