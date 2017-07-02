package com.zhang.springmvc.resource;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import  com.zhang.springmvc.entity.User;;
public class UserController extends AbstractController{

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		List<User> userList = new ArrayList<User>();
		User user1 = new User("张三",23);
		User user2 = new User("李四",34);
		userList.add(user1);
		userList.add(user2);
		return new ModelAndView("/user/userlist","users",userList);
	}

}
