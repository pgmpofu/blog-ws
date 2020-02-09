package com.eaworld.blog.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.eaworld.blog.model.BlogPost;

@Repository
public interface BlogPostRepository extends PagingAndSortingRepository<BlogPost, Long>{

}
