package net.kzn.PageRankOnline.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class globalDefaultExceptionHandler 
{
	@ExceptionHandler(NoHandlerFoundException.class)
	public ModelAndView handlerNoHandlerFoundException()
	{
		ModelAndView mv  = new ModelAndView("error");
		
		mv.addObject("errorTitle","This Page is Not Constructed");
		mv.addObject("errorDescription","This Page you are looking for is not available");
		
		mv.addObject("title","404 Error Page");
		
		return mv;
	}
	

}
