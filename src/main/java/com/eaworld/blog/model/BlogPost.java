package com.eaworld.blog.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BlogPost {
	
	private String title;
	private String blogContent;
	private List<Comment> comments;

}
