package com.eaworld.blog.model.response;

import com.eaworld.blog.model.Author;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CommentResponse {
	private String commentContent;
	private Author author;

}
