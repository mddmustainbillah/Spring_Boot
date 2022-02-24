package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CoursesController {
	@RequestMapping("course") // when need to execute a file
	//@ResponseBody   "when need to print just texts"
	public String courses()
	{
		System.out.println("Welcome to our house");
		return "course";
	}
}
