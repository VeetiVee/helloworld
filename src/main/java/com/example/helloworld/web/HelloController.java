package com.example.helloworld.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

// @CONTROLLER ANNOTAATIO KERTOO ETTÄ TÄMÄ ON KONTROLLERI JA TUO KÄYTTÖÖN  
// IMPORTIN KAUTTA KAIKEN WWW-TOIMINNON
@Controller
@ResponseBody
public class HelloController {
	// @REQUESTMAPPING ANNOTAATIO MÄÄRITTÄÄ, ETTÄ MISTÄ ENDPOINTISTA
	// SOVELLUKSEEN TULLAAN
	@RequestMapping("/hello")
	public String hello(@RequestParam(name="location") String location, @RequestParam(name="name") String name) {
		return "Welcome to the " + location + " " + name + "!";
	}
}