package iad.istudy.thematic.entities;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Data @NoArgsConstructor @AllArgsConstructor
public class Theme {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String uuid;
	
	private String name;
	
	private String code;
	
	private String description;
	
	private int weight;
	
	@ManyToOne		 
	private Theme parent;
	
	@OneToMany(mappedBy = "parent")
	private Collection<Theme> children;


	
	
	
}