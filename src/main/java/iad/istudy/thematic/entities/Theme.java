package iad.istudy.thematic.entities;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity @Data
public class Theme {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String uuid;
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
		this.children = children;
	}
}