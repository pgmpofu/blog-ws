package com.eaworld.blog.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eaworld.blog.model.BlogPost;
import com.eaworld.blog.repository.BlogPostRepository;


@Service
public class BlogPostService {
	
	@Autowired
	BlogPostRepository blogPostRepository;
	
	public List<BlogPost> getBlogPosts() {
		return (List<BlogPost>) blogPostRepository.findAll();
	}
	
	public Optional<BlogPost> getBlogPost(Long blogPostId) {
		return blogPostRepository.findById(blogPostId);
	}
	
	public BlogPost createBlogPost(BlogPost blogPost) {
		return blogPostRepository.save(blogPost);
	}
}
