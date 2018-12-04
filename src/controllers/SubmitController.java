package controllers;

import driver.SubmitControllerDriver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class SubmitController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res) throws Exception {
		
	SubmitControllerDriver submitControllerDriver = new SubmitControllerDriver();
	submitControllerDriver.addStudentDetails(req,res);
	
	ModelAndView modelAndView = new ModelAndView("regComplete");
		return modelAndView;
	}
	
	 
 
}
