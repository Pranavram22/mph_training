package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class HelloController {
public String homePage(Model model) {
	model.addAttributes()
	return "home";
}
}
