package net.kzn.PageRankOnline.controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class PageController 
{
	private static final Logger logger = LoggerFactory.getLogger(PageController.class);
	@Autowired
	
	
	@RequestMapping(value= {"/","/home","/index"})
	public ModelAndView index()
	{
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","home");
		
		logger.info("Inside PageController index method");
		logger.debug("Inside PageController  index method");
		
		/*//passing the list of categories
		mv.addObject("categories",categoryDAO.list());*/
		
		mv.addObject("userClickHome",true);
		return mv;
	}
	
	/*
	 * Method to load all the products and based on category
	 */
	/*@RequestMapping(value= {"show","/all","/products"})
	public ModelAndView showAllServices()
	{
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","All Services");
		
		//passing the list of categories
		mv.addObject("categories",categoryDAO.list());
		
		mv.addObject("userClickAllServices",true);
		return mv;
	}*/
	
	/*@RequestMapping(value= {"show","/category","/products"})
	public ModelAndView showAllServices()
	{
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","All Services");
		
		//passing the list of categories
		mv.addObject("categories",categoryDAO.list());
		
		mv.addObject("userClickAllServices",true);
		return mv;
	}*/
	
	/* 
	 * having similar mapping to our flow id
	 */
	@RequestMapping(value="/register")
	public ModelAndView register()
	{
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","About Us");
		
		return mv;
	}
	
}
