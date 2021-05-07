package iad.istudy.thematic.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import iad.istudy.thematic.entities.Theme;
import iad.istudy.thematic.repositories.ThemeRepository;
@Service
public class ThemeServiceImp implements ThemeService {
	
	
	@Autowired
	private ThemeRepository themeRepository;

	@Override
	public Theme addNewTheme(Theme theme) {
		// TODO Auto-generated method stub
		return themeRepository.save(theme);
	}

	@Override
	public Theme updateTheme(Theme theme) {
		// TODO Auto-generated method stub
		return themeRepository.save(theme);
	}

	@Override
	public void deleteTheme(Theme theme) {
		// TODO Auto-generated method stub
		themeRepository.delete(theme);
		
	}

	@Override
	public void deleteThemeParId(Long id) {
		// TODO Auto-generated method stub
		themeRepository.deleteById(id);
	}

	@Override
	public Theme getThemeParId(Long id) {
		// TODO Auto-generated method stub
		return themeRepository.findById(id).get();
	}

	@Override
	public List<Theme> tousLesThemes() {
		// TODO Auto-generated method stub
		return themeRepository.findAll();
	}

	@Override
	public Theme getThemeParCode(String code) {
		// TODO Auto-generated method stub
		return themeRepository.findByCode(code);
	}


}
