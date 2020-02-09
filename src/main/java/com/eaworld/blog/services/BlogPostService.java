package com.eaworld.blog.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eaworld.blog.dto.BlogPostDTO;
import com.eaworld.blog.model.BlogPost;
import com.eaworld.blog.repository.BlogPostRepository;

/**
 *
 * @author Patience Mpofu
 * @date 08/02/2020
 * Processes requests for blog posts
 */
@Service
public class BlogPostService {
	
	@Autowired
	BlogPostRepository blogPostRepository;
	
    /**
     *
     * @return all blog posts
     */
    public List<BlogPost> getBlogPosts() {
		return (List<BlogPost>) blogPostRepository.findAll();
	}
	
    /**
     *
     * @param blogPostId - blog post that we are searching for
     * @return - Blog Post with the given id
     */
    public Optional<BlogPost> getBlogPost(Long blogPostId) {
		return blogPostRepository.findById(blogPostId);
	}
	
    /**
     *
     * @param blogPost
     * @return the saved blog post
     */
    public BlogPostDTO createBlogPost(BlogPostDTO blogPostDTO) {
    	BlogPost blogPost = new BlogPost();
    	BeanUtils.copyProperties(blogPostDTO, blogPost);
    	BlogPost storedBlogPost = blogPostRepository.save(blogPost);
    	BlogPostDTO storedDTO = new BlogPostDTO();
    	BeanUtils.copyProperties(storedBlogPost, storedDTO);
		return storedDTO;
	}
}