package com.zhang.springmvc.resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
//zsj
@Controller
@RequestMapping("/test")
public class DemoResource{
	
	@RequestMapping("/simple")
	public ModelAndView test(){
		System.out.println("*********************");
		return new ModelAndView("html");
	}
	
	@RequestMapping("/viewName")
	public ModelAndView test2(){
		System.out.println("+++++++++++++++++++++");
		return new ModelAndView("user/show");
	}
	
	@RequestMapping(value="/send",method=RequestMethod.GET)
	public ModelAndView test3(String name,String password){
		System.out.println("name="+name+" password="+password);
		ModelAndView mv =  new ModelAndView("views/viewName");
		mv.addObject("msg","good msg");
		return mv;
	}
	

}
