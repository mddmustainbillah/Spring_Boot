package com.example.demo;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CoursesController {
	@RequestMapping("course") // when need to execute a file
	//@ResponseBody   "when need to print just texts"
	
	
	public ModelAndView courses(@RequestParam("cname") String coursename)
	{
		
		//System.out.println("The course name is :" +cname);
		ModelAndView mv = new ModelAndView();
		mv.addObject("cname", coursename);
		mv.setViewName("course");
		return mv;
	} 
}
