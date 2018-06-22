package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

	// need a controller method to show the initial HTML form
	
	/* @RequestMapping("/showForm") means the request path(url)
	 * for "helloworld-form.jsp page"  is "/showForm"
	 * So if we request /showForm it will show you the "helloworld-form.jsp page"
	 * 
	 */
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	
	// need a controller method to process HTML form
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}


// Make a controller method to read a form data and
// add data to a model
// HttpServletRequest holds html form data
// Model = container for your data
@RequestMapping("/processFormVersionTwo")
public String letsShoutDude(HttpServletRequest request, Model model) {
	
	// read the request parameter from the html form
	String name = request.getParameter("studentName");
	// covert the data to all upercase
	name = name.toUpperCase();
	// create the message
	String result = "Yo! " + name;
	
	// add message to the model
	// "message" = the name of model attribute
	// result = the actual value of the attribute
	model.addAttribute("message", result);
	
	return "helloworld";
}
}




/*
return "helloworld-form";  -- Spring MVC will add prefix and subfix,
then it become " /WEB-INF/view/helloworld-form.jsp "



*/