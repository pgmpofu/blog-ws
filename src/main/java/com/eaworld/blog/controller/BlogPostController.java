package com.eaworld.blog.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eaworld.blog.dto.BlogPostDTO;
import com.eaworld.blog.dto.CommentDTO;
import com.eaworld.blog.model.BlogPost;
import com.eaworld.blog.model.Comment;
import com.eaworld.blog.model.request.BlogPostRequest;
import com.eaworld.blog.model.response.BlogPostResponse;
import com.eaworld.blog.model.response.CommentResponse;
import com.eaworld.blog.services.BlogPostService;
import com.eaworld.blog.services.CommentService;

@RestController
@RequestMapping("/posts")
public class BlogPostController {

	@Autowired
	BlogPostService blogPostService;

	@Autowired
	CommentService commentService;

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
	public BlogPostResponse getBlogPostById(@PathVariable String blogPostId) {
		BlogPostResponse blogPostResponse = new BlogPostResponse();
		BlogPostDTO blogPostDTO = new BlogPostDTO();
		Optional<BlogPost> blogPost = blogPostService.getBlogPost(Long.valueOf(blogPostId));
		BeanUtils.copyProperties(blogPost, blogPostResponse);
		return blogPostResponse;
	}

	@GetMapping
	public List<BlogPostResponse> getBlogPosts() {
		List<BlogPostResponse> blogPostResponses = new ArrayList<BlogPostResponse>();
		List<BlogPostDTO> blogPostDTOs = new ArrayList<BlogPostDTO>();
		List<BlogPost> blogPosts = blogPostService.getBlogPosts();
		blogPosts.stream().map((blogPost) -> {
			BlogPostDTO blogPostDTO = new BlogPostDTO();
			BeanUtils.copyProperties(blogPost, blogPostDTO);
			return blogPostDTO;
		}).forEachOrdered((blogPostDTO) -> {
			blogPostDTOs.add(blogPostDTO);
		});
		return blogPostResponses;
	}

	@GetMapping("/{id}/comments")
	public List<CommentResponse> getComments(@PathVariable String blogId) {
		List<CommentResponse> commentResponses = new ArrayList<CommentResponse>();
		List<CommentDTO> commentDTOs = new ArrayList<CommentDTO>();
		List<Comment> comments = commentService.getComments(Long.valueOf(blogId));
		comments.stream().map((comment) -> {
			CommentDTO commentDTO = new CommentDTO();
			BeanUtils.copyProperties(comment, commentDTO);
			return commentDTO;
		}).forEachOrdered((commentDTO) -> {
			commentDTOs.add(commentDTO);
		});
		
		return commentResponses;

	}

}
