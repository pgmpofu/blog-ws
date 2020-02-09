package com.eaworld.blog.model.request;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Patience Mpofu
 * @date 02/08/2020
 * REST Request for blog posts
 */
@Getter
@Setter
public class BlogPostRequest {
	
	private String id;
	private String title;

}
