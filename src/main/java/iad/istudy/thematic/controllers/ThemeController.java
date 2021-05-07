package iad.istudy.thematic.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import iad.istudy.thematic.entities.Theme;
import iad.istudy.thematic.services.ThemeService;

@Controller
public class ThemeController {
	@Autowired
	private ThemeService themeService;
	
	@GetMapping("/index")
	public String allTheme(Model model) {
		model.addAttribute("themes", themeService.tousLesThemes());
		return "index";
	}
	
	@PostMapping("/addTheme")
	public String addTheme(@Validated Theme theme, BindingResult result, Model model) {
	    
		themeService.addNewTheme(theme);
		/*
		System.out.println("uuid:"+theme.getUuid());
		System.out.println("name:"+theme.getName());
		System.out.println("desc:"+theme.getDescription());
		System.out.println("code:"+theme.getCode());
		System.out.println("wei:"+theme.getWeight());
*/
		return "redirect:index";
	}
	
	@GetMapping("/addTheme")
	public String formTheme(Theme theme) {
		
		return "add-theme";
	}
}
