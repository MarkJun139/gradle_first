package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.command.FormCommand;
@Controller
@RequestMapping("/form")
public class FormController {

	@GetMapping
	public String form() {
		return "form/form";
	}
	
	@PostMapping
	public String submit(@ModelAttribute("command") FormCommand command) {
		System.out.println(command.getName());
		return "redirect:/";
	}
}
