package com.eaworld.blog.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Entity(name="blogPosts")
@Getter
@Setter
public class BlogPost {
	
	@Id @GeneratedValue
	private String id;
	private String title;
	private String blogContent;
	@OneToMany
	private List<Comment> comments;

}
