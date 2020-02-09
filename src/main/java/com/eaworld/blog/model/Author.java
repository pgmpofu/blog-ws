package com.eaworld.blog.model;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Author {

	private String firstName;
	private String lastName;

}
