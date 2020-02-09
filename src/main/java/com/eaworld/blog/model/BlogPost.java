package com.eaworld.blog.model;

import java.util.List;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class BlogPost {
	
	private String title;
	private String blogContent;
	private List<Comment> comments;

}
