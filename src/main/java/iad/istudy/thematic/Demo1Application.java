package iad.istudy.thematic;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import iad.istudy.thematic.entities.Theme;

import iad.istudy.thematic.services.ThemeService;

@SpringBootApplication
public class Demo1Application implements CommandLineRunner{
	@Autowired
	private ThemeService themeService;

	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Theme tm1= themeService.addNewTheme(new Theme(null,"bushh","2015GZ" ,"mbooo","descr", 23,null, new ArrayList<>()));
		themeService.addNewTheme(new Theme(null,"bushh","2015GZ" ,"mbooo","descr", 23,tm1, new ArrayList<>()));
		themeService.addNewTheme(new Theme(null,"bushh","2015GZ" ,"mbooo","descr", 23,tm1, new ArrayList<>()));
		
		//themeRepository.save(new Theme("bushConsttt", new ArrayList<>()));
		//themeRepository.save(new Theme("bushh234567", new ArrayList<>()));
		//themeRepository.save(new Theme("bushh021", new ArrayList<>()));
		//themeRepository.save(new Theme("bushhZoneCap", new ArrayList<>()));
		
	}
}