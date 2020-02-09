package com.eaworld.blog.services;

import java.util.List;

import com.eaworld.blog.dto.BlogPostDTO;

public interface BlogService {
	
	List<BlogPostDTO> getBlogPosts(int page, int limit);
    BlogPostDTO getBlogPost(Long blogPostId);
    BlogPostDTO createBlogPost(BlogPostDTO blogPostDTO);

}
