package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*-  @Controller extends @Component, so it will also get picked from 
 * @ComponentScan
 * 
 * - @RequestMapping will add the request path to the method, so method
 *    can return the JSP page based on the request path from @RequestMapping
 */

@Controller
public class HomeController {

	
	@RequestMapping("/")
	public String showPage() {
// main=menu is the name of the page that this method returns
		return "main-menu";
	}

}
