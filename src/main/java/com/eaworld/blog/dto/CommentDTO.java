package com.eaworld.blog.dto;

import com.eaworld.blog.model.Author;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CommentDTO {
	private String commentContent;
	private Author author;
}
