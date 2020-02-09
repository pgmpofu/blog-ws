package com.eaworld.blog.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Entity(name="authors")
@Getter
@Setter
public class Author {

	@Id @GeneratedValue
	private String id;
	private String firstName;
	private String lastName;
	@OneToMany
	private List<Comment> comments;

}
