package com.tj.gitbranchingdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class apiController {

	@GetMapping("/api/add")
	public int performAddition(@RequestParam int num1, @RequestParam int num2) {
		
		//Calculate sum
		int sum = num1 + num2;
		
		return sum;
		
	}
	
}
