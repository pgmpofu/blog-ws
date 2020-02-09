package com.eaworld.blog.service;

import java.util.List;

import com.eaworld.blog.dto.BlogPostDTO;

/**
 *
 * @author Patience Mpofu
 * @date 02/09/2020
 * Service class for processing blog posts
 * A DTO is a data transfer object
 */
public interface BlogPostService {
	
    /**
     *
     * @param page 
     * @param limit - number of records we expect to retrieve
     * @return blog post DTOs for expected records.
     */
    List<BlogPostDTO> getBlogPosts(int page, int limit);

    /**
     *
     * @param blogPostId
     * @return requested blog DTO
     */
    BlogPostDTO getBlogPost(Long blogPostId);

    /**
     *
     * @param blogPostDTO
     * @return created blog DTO
     */
    BlogPostDTO createBlogPost(BlogPostDTO blogPostDTO);

}
