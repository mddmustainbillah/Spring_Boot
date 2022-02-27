package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CoursesController {
	@RequestMapping("course") // when need to execute a file
	//@ResponseBody   "when need to print just texts"
	
	
	public String courses(HttpServletRequest req)
	{
		HttpSession session = req.getSession();
		String cname = req.getParameter("cname");
		System.out.println("The course name is :" +cname);
		session.setAttribute("cname", cname);
		return "course";
	} 
}
