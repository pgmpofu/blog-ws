package com.eaworld.blog.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

@Entity (name="comments")
@Getter
@Setter
public class Comment {
	@Id @GeneratedValue
	private String id;
	private String commentContent;
	private long blogId;
	@ManyToOne
	private Author author;

}
