package com.demohot.blogs.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.demohot.blogs.model.User;

@Controller
public class UserController {
	@RequestMapping("/user/my")
	public ModelAndView my(HttpSession session) {
		User user = (User) session.getAttribute("myUser");
		if (null == user) {
			return new ModelAndView("redirect:/login");
		} else {
			Map<String, Object> kv = new HashMap<>();
			kv.put("myUser", user);
			return new ModelAndView("/user/my.jsp", kv);
		}
	}
}
