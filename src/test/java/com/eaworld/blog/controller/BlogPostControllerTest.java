package com.eaworld.blog.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.eaworld.blog.builder.TestDataFactory;
import com.eaworld.blog.dto.BlogPostDTO;
import com.eaworld.blog.dto.CommentDTO;
import com.eaworld.blog.model.BlogPost;
import com.eaworld.blog.model.Comment;
import com.eaworld.blog.model.response.BlogPostResponse;
import com.eaworld.blog.repository.BlogPostRepository;
import com.eaworld.blog.repository.CommentRepository;
import com.eaworld.blog.service.CommentService;
import com.eaworld.blog.service.impl.BlogPostServiceImpl;

class BlogPostControllerTest {

	@InjectMocks
	BlogPostController blogPostController;

	@Mock
	BlogPostServiceImpl blogPostService;

	@Mock
	CommentService commentService;
	
	@Mock
	BlogPostRepository blogPostRepository;
	
	@Mock
	CommentRepository commentRepository;
	

	@BeforeEach
	void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	void testCreateBlogPost() {
		when(blogPostService.createBlogPost(Mockito.any(BlogPostDTO.class))).thenReturn(TestDataFactory.createABlogPostDTO());
		BlogPostResponse res = blogPostController.createBlogPost(TestDataFactory.createABlogPostRequest());
		assertNotNull(res);
	}

	@Test
	void testGetBlogPostById() {
		when(blogPostService.getBlogPost(Mockito.anyLong())).thenReturn(TestDataFactory.createABlogPostDTO());
		BlogPostResponse res = blogPostController.getBlogPostById(1L);
		assertNotNull(res);
	}

	@Test
	void testGetBlogPosts() {
		final int page = 0;
		final int limit = 25;
		final int count = 3;
		List<BlogPostDTO> blogPostDTOs = new ArrayList<>(TestDataFactory.createBlogPostDTOs());
		when(blogPostService.getBlogPosts(page, limit)).thenReturn(blogPostDTOs);
		List<BlogPostResponse> retrievedBlogPostDTOs = blogPostController.getBlogPosts(page, limit);
		assertNotNull(retrievedBlogPostDTOs);
		assertEquals(count, retrievedBlogPostDTOs.size());
	}

	@Test
	void testCreateComment() {
		when(blogPostService.getBlogPost(Mockito.anyLong())).thenReturn(TestDataFactory.createABlogPostDTO());
		when(blogPostRepository.findById(Mockito.anyLong())).thenReturn(Optional.of(TestDataFactory.createABlogPost()));
		when(blogPostRepository.save(Mockito.any(BlogPost.class))).thenReturn(TestDataFactory.createABlogPost());
		when(commentRepository.save(Mockito.any(Comment.class))).thenReturn(TestDataFactory.createAComment());
		when(commentService.createComment(Mockito.any(CommentDTO.class))).thenReturn(TestDataFactory.createACommentDTO());
		when(blogPostService.updateBlogPost(Mockito.any(BlogPostDTO.class))).thenReturn(TestDataFactory.createABlogPostDTO());
		BlogPostResponse response = blogPostController.createComment(1L, TestDataFactory.createACommentRequest());
		assertNotNull(response);
	}

}
