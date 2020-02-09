package com.eaworld.blog.dto;

import java.util.List;

import com.eaworld.blog.model.Comment;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BlogPostDTO {
	
	private String title;
	private String blogContent;
	private List<Comment> comments;

}
