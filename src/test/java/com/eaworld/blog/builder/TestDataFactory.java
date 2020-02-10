package com.eaworld.blog.builder;

import java.util.ArrayList;
import java.util.List;

import com.eaworld.blog.dto.BlogPostDTO;
import com.eaworld.blog.dto.CommentDTO;
import com.eaworld.blog.model.BlogPost;
import com.eaworld.blog.model.Comment;
import com.eaworld.blog.model.request.BlogPostRequest;
import com.eaworld.blog.model.request.CommentRequest;
import com.eaworld.blog.model.response.BlogPostResponse;

public class TestDataFactory {

	public static BlogPost createABlogPost() {
		BlogPost blogPost = new BlogPost();
		blogPost.setId(1L);
		blogPost.setAuthorFirstName("Jonah");
		blogPost.setAuthorLastName("Fish");
		blogPost.setTitle("Test Title");
		blogPost.setBlogContent("This is a test blog");
		blogPost.setComments(new ArrayList<Comment>());
		
		return blogPost;
	}
	
	public static BlogPostDTO createABlogPostDTO() {
		BlogPostDTO blogPostDTO = new BlogPostDTO();
		blogPostDTO.setId(1L);
		blogPostDTO.setAuthorFirstName("Jonah");
		blogPostDTO.setAuthorLastName("Fish");
		blogPostDTO.setTitle("Test Title");
		blogPostDTO.setBlogContent("This is a test blog");
		blogPostDTO.setComments(new ArrayList<Comment>());
		return blogPostDTO;
	}
	
	public static BlogPostResponse createABlogPostResponse() {
		BlogPostResponse res = new BlogPostResponse();
		res.setId(1L);
		res.setAuthorFirstName("Jonah");
		res.setAuthorLastName("Fish");
		res.setTitle("Test Title");
		res.setBlogContent("This is a test blog");
		res.setComments(new ArrayList<Comment>());
		return res;
	}
	
	public static BlogPostRequest createABlogPostRequest() {
		BlogPostRequest req = new BlogPostRequest();
		req.setId("1");
		req.setAuthorFirstName("Testing");
		req.setAuthorLastName("OneTwo");
		req.setBlogContent("This is just a load of content");
		req.setTitle("This is just a title");
		req.setComments(new ArrayList<Comment>());
		return req;
	}
	
	public static  List<BlogPost> createBlogPosts() {
		List<BlogPost> blogPosts= new ArrayList<>();
		BlogPost aBlogPost = new BlogPost();
		aBlogPost.setId(1L);
		aBlogPost.setAuthorFirstName("Jonah");
		aBlogPost.setAuthorLastName("Fish");
		aBlogPost.setTitle("Test Title");
		aBlogPost.setBlogContent("This is a test blog");
		aBlogPost.setComments(new ArrayList<Comment>());
		blogPosts.add(aBlogPost);
		
		BlogPost bBlogPost = new BlogPost();
		bBlogPost.setId(2L);
		bBlogPost.setAuthorFirstName("Janine");
		bBlogPost.setAuthorLastName("Fisher");
		bBlogPost.setTitle("Test Title for Janine");
		bBlogPost.setBlogContent("This is a test blog for Janine");
		bBlogPost.setComments(new ArrayList<Comment>());
		blogPosts.add(bBlogPost);
		
		BlogPost cBlogPost = new BlogPost();
		cBlogPost.setId(3L);
		cBlogPost.setAuthorFirstName("Blanca");
		cBlogPost.setAuthorLastName("Star");
		cBlogPost.setTitle("Test STAR technique");
		cBlogPost.setBlogContent("This is a test blog for Blanca");
		cBlogPost.setComments(new ArrayList<Comment>());
		blogPosts.add(cBlogPost);
		
		return blogPosts;
	}
	
	public static  List<BlogPostDTO> createBlogPostDTOs() {
		List<BlogPostDTO> blogPostDTOs= new ArrayList<>();
		BlogPostDTO aBlogPostDTO = new BlogPostDTO();
		aBlogPostDTO.setId(1L);
		aBlogPostDTO.setAuthorFirstName("Jonah");
		aBlogPostDTO.setAuthorLastName("Fish");
		aBlogPostDTO.setTitle("Test Title");
		aBlogPostDTO.setBlogContent("This is a test blog");
		aBlogPostDTO.setComments(new ArrayList<Comment>());
		blogPostDTOs.add(aBlogPostDTO);
		
		BlogPostDTO bBlogPostDTO = new BlogPostDTO();
		bBlogPostDTO.setId(2L);
		bBlogPostDTO.setAuthorFirstName("Janine");
		bBlogPostDTO.setAuthorLastName("Fisher");
		bBlogPostDTO.setTitle("Test Title for Janine");
		bBlogPostDTO.setBlogContent("This is a test blog for Janine");
		bBlogPostDTO.setComments(new ArrayList<Comment>());
		blogPostDTOs.add(bBlogPostDTO);
		
		BlogPostDTO cBlogPostDTO = new BlogPostDTO();
		cBlogPostDTO.setId(3L);
		cBlogPostDTO.setAuthorFirstName("Blanca");
		cBlogPostDTO.setAuthorLastName("Star");
		cBlogPostDTO.setTitle("Test STAR technique");
		cBlogPostDTO.setBlogContent("This is a test blog for Blanca");
		cBlogPostDTO.setComments(new ArrayList<Comment>());
		blogPostDTOs.add(cBlogPostDTO);
		
		return blogPostDTOs;
	}
	
	public static Comment createAComment() {
		Comment comment = new Comment();
		comment.setAuthorFirstName("Test");
		comment.setAuthorLastName("Testing");
		comment.setCommentContent("This is just a test content thing");
		return comment;
	}
	
	public static CommentDTO createACommentDTO() {
		CommentDTO commentDTO = new CommentDTO();
		commentDTO.setId(1L);
		commentDTO.setAuthorFirstName("Test");
		commentDTO.setAuthorLastName("Testing");
		commentDTO.setCommentContent("This is just a test content thing");
		return commentDTO;
	}
	
	public static CommentRequest createACommentRequest() {
		CommentRequest req = new CommentRequest();
		req.setAuthorFirstName("Test");
		req.setAuthorLastName("Testing");
		req.setCommentContent("This is just a test content thing");
		return req;
	}
}
