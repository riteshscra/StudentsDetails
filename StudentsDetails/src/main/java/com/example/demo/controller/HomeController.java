package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.DetailsRepo;
import com.example.demo.model.Details;

@Controller
public class HomeController 
{
	@Autowired
	DetailsRepo repo;
	
	@RequestMapping("/")
	public String home()
	{
		return"home.jsp";
	}
	@RequestMapping("/addDetails")
	public String addDetails(Details details)
	{
		repo.save(details);
		return "home.jsp";
	}
	@RequestMapping("/getDetails")
	public ModelAndView getDetails(@RequestParam int Roll_number)
	{
		ModelAndView mv =new ModelAndView("showDetails.jsp");
		Details details =repo.findById(Roll_number).orElse(new Details());
		mv.addObject(details);
		return mv;
	}
}
