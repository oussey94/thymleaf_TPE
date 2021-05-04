package iad.istudy.thematic.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import iad.istudy.thematic.repositories.ThemeRepository;

@Controller
public class ThemeController {
	@Autowired ThemeRepository themeRepo;
	
	@RequestMapping("/theme")
	public String getAllTheme(Model model) {
		model.addAttribute("themes", themeRepo.findAll());
		return "index";
	}
}
