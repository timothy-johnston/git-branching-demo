package com.tj.gitbranchingdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {
	
	
	@GetMapping({"", "/", "home"})
	public String index() {
		return "index";
	}
	
	@GetMapping({"calculator"})
	public String calculator() {
		return "calculator";
	}
	

}
