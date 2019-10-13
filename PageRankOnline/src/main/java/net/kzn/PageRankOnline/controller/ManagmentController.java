package net.kzn.PageRankOnline.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/manage")
public class ManagmentController 
{
	@RequestMapping(value="/products", method=RequestMethod.GET)
	public ModelAndView showManageProducts()
	{
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("userClickManageProduct");
		mv.addObject("title","Manage Products");
		
		return mv;
		
		
	}

}
