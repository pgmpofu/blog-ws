package com.eaworld.blog.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.eaworld.blog.model.BlogPost;

@Repository
public interface BlogPostRepository extends CrudRepository<BlogPost, Long>{

}
