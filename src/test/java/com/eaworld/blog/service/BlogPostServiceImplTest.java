package com.eaworld.blog.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
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
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import com.eaworld.blog.builder.TestDataFactory;
import com.eaworld.blog.dto.BlogPostDTO;
import com.eaworld.blog.exception.BlogPostServiceException;
import com.eaworld.blog.model.BlogPost;
import com.eaworld.blog.repository.BlogPostRepository;
import com.eaworld.blog.service.impl.BlogPostServiceImpl;

class BlogPostServiceImplTest {

	@InjectMocks
	BlogPostServiceImpl blogPostServiceImpl;

	@Mock
	BlogPostRepository blogPostRepository;

	@BeforeEach
	void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	void testGetBlogPost() {
		final long id = 1L;
		BlogPost blogPost = TestDataFactory.createABlogPost();
		Optional<BlogPost> blogOpt = Optional.of(blogPost);
		when(blogPostRepository.findById(Mockito.anyLong())).thenReturn(blogOpt);

		BlogPostDTO blogPostDTO = blogPostServiceImpl.getBlogPost(id);

		assertNotNull(blogPostDTO, "A blog post with id" + " " + id + "  should exist");
		assertEquals(blogPost.getAuthorFirstName(), blogPostDTO.getAuthorFirstName());
		assertEquals(blogPost.getAuthorLastName(), blogPostDTO.getAuthorLastName());
		assertEquals(blogPost.getBlogContent(), blogPostDTO.getBlogContent());
		assertEquals(blogPost.getTitle(), blogPostDTO.getTitle());

	}
	
	@Test
	void testGetBlogPost_BlogNull() {
		final long id = 1L;
		Optional<BlogPost> blogOpt = Optional.empty();
		when(blogPostRepository.findById(Mockito.anyLong())).thenReturn(blogOpt);
		assertThrows(BlogPostServiceException.class, ()-> blogPostServiceImpl.getBlogPost(id));
	}

	@Test
	void testGetBlogPosts() {
		final int page = 0;
		final int limit = 25;
		final int count = 3;
		List<BlogPost> blogPosts = new ArrayList<>(TestDataFactory.createBlogPosts());
		Page<BlogPost> pagedBlogPosts = new PageImpl<BlogPost>(blogPosts);
		
		when(blogPostRepository.findAll(Mockito.any(Pageable.class)))
				.thenReturn(pagedBlogPosts);
		List<BlogPostDTO> blogPostDTOs = blogPostServiceImpl.getBlogPosts(page, limit);
		assertNotNull(blogPostDTOs);
		assertEquals(count, blogPostDTOs.size());
	}
	
	@Test
	void testGetBlogPosts_BlogPostsNull() {
		final int page = 0;
		final int limit = 25;
		
		when(blogPostRepository.findAll(Mockito.any(Pageable.class)))
				.thenReturn(null);
		assertThrows(BlogPostServiceException.class, ()-> blogPostServiceImpl.getBlogPosts(page, limit));
	}
	

	@Test
	void testCreateBlogPost() {
		when(blogPostRepository.save(Mockito.any(BlogPost.class))).thenReturn(TestDataFactory.createABlogPost());
		BlogPostDTO blogPostDTO = blogPostServiceImpl.createBlogPost(TestDataFactory.createABlogPostDTO());
		assertNotNull(blogPostDTO);
	}
	
	@Test
	void testCreateBlogPost_BlogPostNull() {
		when(blogPostRepository.save(Mockito.any(BlogPost.class))).thenReturn(TestDataFactory.createABlogPost());
		assertThrows(BlogPostServiceException.class, ()-> blogPostServiceImpl.createBlogPost(null));
	}

	@Test
	void testUpdateBlogPost() {
		BlogPost blogPost = new BlogPost();
		blogPost.setId(1L);
		blogPost.setAuthorFirstName("Jonah");
		blogPost.setAuthorLastName("Fish");
		blogPost.setTitle("New Title");
		blogPost.setBlogContent("This is a test blog");
		
		when(blogPostRepository.save(Mockito.any(BlogPost.class))).thenReturn(blogPost);
		BlogPostDTO blogPostDTO = TestDataFactory.createABlogPostDTO();
		blogPostDTO.setTitle("New Title");
		BlogPostDTO storedDTO = blogPostServiceImpl.updateBlogPost(blogPostDTO);
		assertNotNull(storedDTO);
		assertEquals(blogPostDTO.getTitle(), storedDTO.getTitle());
		
	}
	
	@Test
	void testUpdateBlogPost_BlogPostNull() {
		when(blogPostRepository.save(Mockito.any(BlogPost.class))).thenReturn(TestDataFactory.createABlogPost());
		assertThrows(BlogPostServiceException.class, ()-> blogPostServiceImpl.updateBlogPost(null));
	}

}
