package com.techpassel.springmvcdemo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GreetingController {
	@RequestMapping("/greet")
	public ModelAndView sayHello(HttpServletRequest request, HttpServletResponse response) {
		String name = request.getParameter("user");
		ModelAndView mView = new ModelAndView();
		mView.setViewName("greet.jsp");
		String msg = "Hello "+ name+"!";
		mView.addObject("message", msg);
		return mView;
	}
}
