package com.eaworld.blog.model;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Comment {
	private String commentContent;
	private Author author;

}
