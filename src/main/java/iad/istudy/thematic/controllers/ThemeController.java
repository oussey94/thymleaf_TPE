package iad.istudy.thematic.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@GetMapping("/addTheme")
	public String formTheme(Theme theme, Model model) {
		
		//themeService.tousLesThemes();
		
		model.addAttribute("themes", themeService.tousLesThemes());
		
		return "add-theme";
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
	
	@GetMapping("/getUpdateTheme/{id}")
	public String getUpdate(@PathVariable("id") Long id, Model model) {
		
		Theme theme=themeService.getThemeParId(id);
		
		model.addAttribute("theme",theme);
		
		return "update-theme";
	}
	
	@PostMapping("/updateTheme/{id}")
	public String postUpdate(@PathVariable("id") Long id, @Validated Theme theme, BindingResult result, Model model) {
		
		/*Theme them=themeService.getThemeParId(id);
		
		them.setCode(theme.getCode());
		
		them.setUuid(theme.getUuid());
		
		them.setDescription(theme.getDescription());
		
		them.setName(theme.getName());
		
		them.setWeight(theme.getWeight());
		
		them.setParent(theme.getParent());
		them.setChildren(theme.getChildren());*/
		
		themeService.updateTheme(theme);
		
		return "redirect:/index";
	}
	
	@GetMapping("/deleteTheme/{id}")
	public String delTheme(@PathVariable("id") Long id, Model model) {
		
		themeService.deleteThemeParId(id);
		
		return "redirect:/index";
	}
	
	
}
