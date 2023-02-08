package com.Springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class Dcontroller {
	@RequestMapping("/test")
	public String top() {
		System.out.print("yoo");
		return "test";
	}
	@RequestMapping("/second")
	public String second() {
		
		return "second";

}
}