package com.eaworld.blog.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.eaworld.blog.dto.BlogPostDTO;
import com.eaworld.blog.model.request.BlogPostRequest;
import com.eaworld.blog.model.response.BlogPostResponse;
import com.eaworld.blog.services.impl.BlogPostServiceImpl;

@RestController
@RequestMapping("/posts")
public class BlogPostController {

	@Autowired
	BlogPostServiceImpl blogPostService;

	@PostMapping("create")
	public BlogPostResponse createBlogPost(@RequestBody BlogPostRequest blogPostRequest) {
		BlogPostResponse blogPostResponse = new BlogPostResponse();
		BlogPostDTO blogPostDTO = new BlogPostDTO();
		BeanUtils.copyProperties(blogPostRequest, blogPostDTO);
		BlogPostDTO createdDTO = blogPostService.createBlogPost(blogPostDTO);
		BeanUtils.copyProperties(createdDTO, blogPostResponse);
		return blogPostResponse;

	}

	@GetMapping("/{id}")
	public BlogPostResponse getBlogPostById(@PathVariable Long id) {
		BlogPostResponse blogPostResponse = new BlogPostResponse();
		BlogPostDTO blogPostDTO = blogPostService.getBlogPost(id);
		BeanUtils.copyProperties(blogPostDTO, blogPostResponse);
		return blogPostResponse;
	}

	@GetMapping
	public List<BlogPostResponse> getBlogPosts(@RequestParam(value = "page", defaultValue = "0") int page,
			@RequestParam(value = "limit", defaultValue = "25") int limit) {
		List<BlogPostResponse> blogPostResponses = new ArrayList<BlogPostResponse>();
		List<BlogPostDTO> blogPostDTOs = blogPostService.getBlogPosts(page, limit);
		for (BlogPostDTO blogPostDTO : blogPostDTOs) {
			BlogPostResponse blogPostResponse = new BlogPostResponse();
			BeanUtils.copyProperties(blogPostDTO, blogPostResponse);
			blogPostResponses.add(blogPostResponse);
		}
		return blogPostResponses;
	}
}
