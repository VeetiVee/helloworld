package com.example.helloworld.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class Contact {

	@RequestMapping("/contact")
	public String contact() {
		return "This is the contact page";
	}
}