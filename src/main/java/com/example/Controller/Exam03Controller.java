package com.example.Controller;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam03")
public class Exam03Controller {

	@Autowired
	private ServletContext application;
	
	@RequestMapping("")
	public String index() {
		return "exam03";
	}
	@RequestMapping("/result")
	public String result(Integer num1, Integer num2, Integer num3) {
		int answer = num1 + num2 + num3; 
		
		//Integer noTax = (Integer)application.getAttribute("noTax");
		application.setAttribute("noTax", answer);
		
		//Integer inTax = (Integer)application.getAttribute("inTax");
		application.setAttribute("inTax", (int)(1.1*(answer)));

		
		//resuestスコープの場合
		//int noTax = num1 + num2 + num3;
		//model.addAttribute("noTax", noTax);
		//model.addAttribute("inTax", (int)(1.1*(noTax)));
		
		return "exam03-result";
	}
	
}
