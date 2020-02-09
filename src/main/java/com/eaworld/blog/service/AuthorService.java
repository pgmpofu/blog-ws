package com.eaworld.blog.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.eaworld.blog.dto.AuthorDTO;

@Service
public interface AuthorService {
	
    /**
     *
     * @param page 
     * @param limit - number of records we expect to retrieve
     * @return author DTOs for expected records.
     */
    List<AuthorDTO> getAuthors(int page, int limit);

    /**
     *
     * @param authorId
     * @return requested author DTO
     */
    AuthorDTO getAuthor(Long authorId);

    /**
     *
     * @param authorDTO
     * @return created author DTO
     */
    AuthorDTO createAuthor(AuthorDTO authorDTO);
}

