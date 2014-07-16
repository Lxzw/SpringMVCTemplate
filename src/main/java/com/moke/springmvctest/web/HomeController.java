package com.moke.springmvctest.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping({"/","/home"})
	public String goHome() {
		return "home";
	}
	@RequestMapping("/login")
	public String login(String username,String password,Model model) {
		
		System.err.println(username);
		System.err.println(password);
		
		String userinfo = username;
		model.addAttribute("userinfo",userinfo);
		model.addAttribute("OK");
		
		return "show";
	}
}
