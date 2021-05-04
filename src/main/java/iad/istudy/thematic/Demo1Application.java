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

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		/*themeRepo.save(new Theme("hfhhff", new ArrayList<>()));
		themeRepo.save(new Theme("dddd", new ArrayList<>()));
		themeRepo.save(new Theme("ddd", new ArrayList<>()));
		*/
	}

}
