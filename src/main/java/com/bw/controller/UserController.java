package com.bw.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bw.entity.User;
import com.bw.service.UserService;

/**
 * @author 武文浩
 *
 * 2019年9月4日
 */
@Controller
public class UserController {
	@Resource
	private UserService service;
	
	@RequestMapping("list.do")
	public ModelAndView findAllUser(){
		ModelAndView av = new ModelAndView();
		List<User> list = service.findAllUser();
		av.setViewName("list");
		av.getModelMap().put("list", list);
		return av;
	}

}
