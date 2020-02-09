package com.eaworld.blog.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.eaworld.blog.dto.BlogPostDTO;
import com.eaworld.blog.exception.BlogPostServiceException;
import com.eaworld.blog.model.BlogPost;
import com.eaworld.blog.repository.BlogPostRepository;
import com.eaworld.blog.service.BlogPostService;

/**
 *
 * @author Patience Mpofu
 * @date 08/02/2020 Processes requests for blog posts
 */
@Service
public class BlogPostServiceImpl implements BlogPostService {

	@Autowired
	BlogPostRepository blogPostRepository;

	/**
	 * @param page  - page of records that we are currently searching for
	 * @param limit - number of records that we are requesting
	 * @return all blog posts
	 */
	public List<BlogPostDTO> getBlogPosts(int page, int limit) {
		List<BlogPostDTO> blogPostDTOs = new ArrayList<BlogPostDTO>();
		Pageable pageRequest = PageRequest.of(page, limit);
		try {
			List<BlogPost> blogPosts = blogPostRepository.findAll(pageRequest).getContent();
			blogPosts.stream().map((blogPost) -> {
				BlogPostDTO blogPostDTO = new BlogPostDTO();
				BeanUtils.copyProperties(blogPost, blogPostDTO);
				return blogPostDTO;
			}).forEachOrdered((blogPostDTO) -> {
				blogPostDTOs.add(blogPostDTO);
			});
		} catch (Exception ex) {
			throw new BlogPostServiceException(ex.getMessage(), ex.getCause());
		}

		return blogPostDTOs;
	}

	/**
	 *
	 * @param blogPostId - blog post that we are searching for
	 * @return - Blog Post with the given id
	 */
	public BlogPostDTO getBlogPost(Long blogPostId) {
		try {
			BlogPost blogPost = blogPostRepository.findById(blogPostId).get();
			BlogPostDTO blogPostDTO = new BlogPostDTO();
			BeanUtils.copyProperties(blogPost, blogPostDTO);
			return blogPostDTO;
		} catch (Exception ex) {
			throw new BlogPostServiceException();
		}
	}

	/**
	 *
	 * @param blogPostDTO - blog post data transfer object
	 * @return the saved blog post data transfer object
	 */
	public BlogPostDTO createBlogPost(BlogPostDTO blogPostDTO) {
		try {
			BlogPost blogPost = new BlogPost();
			BeanUtils.copyProperties(blogPostDTO, blogPost);
			BlogPost storedBlogPost = blogPostRepository.save(blogPost);
			BlogPostDTO storedDTO = new BlogPostDTO();
			BeanUtils.copyProperties(storedBlogPost, storedDTO);
			return storedDTO;
		} catch (Exception ex) {
			throw new BlogPostServiceException(ex.getMessage(), ex.getCause());
		}
	}

	/**
	 * 
	 */
	public BlogPostDTO updateBlogPost(BlogPostDTO blogPostDTO) {
		try {
			BlogPost blogPost = new BlogPost();
			BeanUtils.copyProperties(blogPostDTO, blogPost);
			BlogPost storedBlogPost = blogPostRepository.save(blogPost);
			BlogPostDTO storedDTO = new BlogPostDTO();
			BeanUtils.copyProperties(storedBlogPost, storedDTO);
			return storedDTO;
		} catch (Exception ex) {
			throw new BlogPostServiceException(ex.getMessage(), ex.getCause());
		}
	}
}
