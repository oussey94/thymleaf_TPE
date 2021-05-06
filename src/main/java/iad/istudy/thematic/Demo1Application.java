package iad.istudy.thematic;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import iad.istudy.thematic.entities.Theme;
import iad.istudy.thematic.repositories.ThemeRepository;

@SpringBootApplication
public class Demo1Application implements CommandLineRunner{
	@Autowired
	private ThemeRepository themeRepo;
	

	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
	}

	public Theme addThemeTest(String code, String name, String description, int weight, String code_parent) {
		
		Theme theme = new Theme();
		
		theme.setCode(code);
		theme.setName(name);
		theme.setDescription(description);
		theme.setWeight(weight);
		
		if(code_parent != null)
			theme.setParent(themeRepo.findByCode(code_parent));
	
		return theme;
	}
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		themeRepo.save(addThemeTest("FEATURE", "Caractéristiques", "Caractéristiques", 1, null));
		themeRepo.save(addThemeTest("DYNAMIC", "Dynamique territoriale", "Dynamique territoriale", 2, "FEATURE"));
		themeRepo.save(addThemeTest("THERPRR", "THERPRR territoriale", "THERPRR territoriale", 5, "DYNAMIC"));
		
	
		 
		
	}

}