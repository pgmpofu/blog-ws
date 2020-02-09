package com.eaworld.blog.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Comment {
	private String commentContent;
	private Author author;

}
