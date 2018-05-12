package com.demohot.blogs.dao;

import com.demohot.blogs.po.User;

public interface UserDao {
	void insert(User user);

	void select();

	boolean login(String username, String password);
}
