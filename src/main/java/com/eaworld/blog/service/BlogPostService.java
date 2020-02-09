package com.eaworld.blog.service;

import java.util.List;

import com.eaworld.blog.dto.BlogPostDTO;

public interface BlogPostService {
	
	List<BlogPostDTO> getBlogPosts(int page, int limit);
    BlogPostDTO getBlogPost(Long blogPostId);
    BlogPostDTO createBlogPost(BlogPostDTO blogPostDTO);

}
