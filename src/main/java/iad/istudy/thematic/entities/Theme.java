package iad.istudy.thematic.entities;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.springframework.lang.Nullable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Data @NoArgsConstructor
public class Theme {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String uuid;
	
	@Column(nullable = false)
	private String name;
	
	private String code;
	
	private String description;
	
	@ManyToOne
	private Theme parent;
	
	@OneToMany(mappedBy = "parent")
	private Collection<Theme> children;
	
	public Theme(String uuid, Collection<Theme> children) {
		super();
		this.uuid = uuid;
		this.children = new ArrayList<>();
	}
}