package com.demohot.blogs.dao.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.demohot.blogs.mapper.UserMapper;
import com.demohot.blogs.model.User;

@RunWith(SpringRunner.class)
@ContextConfiguration({ "classpath:app-context.xml" })
public class UserMapperTest {
	@Autowired
	private UserMapper userMapper;

	@Test
	public void loginTest() {
		String username = "tom";
		String password = "123";
		User user = userMapper.getByUsernameAndPassword(username, password);
		System.out.println(user);
	}
}
