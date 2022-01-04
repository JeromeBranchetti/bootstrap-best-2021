package org.generation.italy.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping
public class IndexController {
	
	@GetMapping
	//@ResponseBody
	public String index(Model model) {
		String mioNome = "Jerome Branchetti";
		model.addAttribute("name", mioNome);
		
		
		return "index";
	}

}
