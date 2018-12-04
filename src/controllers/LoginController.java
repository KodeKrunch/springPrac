package controllers;
import java.util. *;
import driver.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

import org.springframework.web.servlet.mvc.Controller;


public class LoginController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res) throws Exception {
		
		LoginControllerDriver loginControllerDriver = new LoginControllerDriver();
		boolean result=loginControllerDriver.validateCredentials(req, res);
		
		if(result==true) {
			ModelAndView modelAndView= new ModelAndView("loggedIn");
			return modelAndView;
		}else {
			ModelAndView modelAndView= new ModelAndView("failed");
			return modelAndView;
		}
		
		
	}
}

	
	

