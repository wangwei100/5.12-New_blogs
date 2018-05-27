package com.demohot.blogs.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demohot.blogs.mapper.UserMapper;
import com.demohot.blogs.model.User;

@Controller
public class LoginController {

	@Autowired
	private UserMapper userMapper;

	@RequestMapping("/login")
	public String login() {
		return "login.jsp";
	}

	@RequestMapping("/do_login")
	public String doLogin(String username, String password, HttpSession session) {
		User user = userMapper.getByUsernameAndPassword(username, password);
		if (null != user) {
			session.setAttribute("myUser", user);
			return "redirect:/user/my";
		} else {
			return "redirect:/login";
		}
	}
}
   