package com.eaworld.blog.model.response;

import java.util.List;

import com.eaworld.blog.model.Comment;

/**
 *
 * @author Patience Mpofu
 * @date 02/08/2020
 * REST response for blog post requests
 */
public class BlogPostResponse {
	
	private String title;
	private String blogContent;
	private List<Comment> comments;

}
