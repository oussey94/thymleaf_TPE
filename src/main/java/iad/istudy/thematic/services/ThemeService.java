package iad.istudy.thematic.services;

import java.util.List;

import iad.istudy.thematic.entities.Theme;

public interface ThemeService {
	
    Theme addNewTheme(Theme theme);
	
	Theme updateTheme(Theme theme);
	
	void deleteTheme(Theme theme);
	
	void deleteThemeParId(Long id);
	
	Theme getThemeParId(Long id);
	
	List<Theme> tousLesThemes();
	
	Theme getThemeParCode(String code);

}
