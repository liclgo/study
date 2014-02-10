package com.licl.study.springgo.action;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class Action {

	
	@RequestMapping("/do1")
	public String do1(ModelMap model){
		model.addAttribute("user", "licl");
		model.put("list", Arrays.asList("a","b"));
		return "index";
	}
}
