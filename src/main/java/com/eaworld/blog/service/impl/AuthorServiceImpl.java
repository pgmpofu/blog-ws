package com.eaworld.blog.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import com.eaworld.blog.dto.AuthorDTO;
import com.eaworld.blog.exception.AuthorServiceException;
import com.eaworld.blog.model.Author;
import com.eaworld.blog.repository.AuthorRepository;
import com.eaworld.blog.service.AuthorService;

public class AuthorServiceImpl implements AuthorService {

	@Autowired
	AuthorRepository authorRepository;

	@Override
	public List<AuthorDTO> getAuthors(int page, int limit) {

		List<AuthorDTO> authorDTOs = new ArrayList<AuthorDTO>();
		Pageable pageRequest = PageRequest.of(page, limit);
		try {
			List<Author> authors = authorRepository.findAll(pageRequest).getContent();
			authors.stream().map((author) -> {
				AuthorDTO authorDTO = new AuthorDTO();
				BeanUtils.copyProperties(author, authorDTO);
				return authorDTO;
			}).forEachOrdered((authorDTO) -> {
				authorDTOs.add(authorDTO);
			});
		} catch (Exception ex) {
			throw new AuthorServiceException();
		}

		return authorDTOs;
	}

	@Override
	public AuthorDTO getAuthor(Long authorId) {
		try {
			Author author = authorRepository.findById(authorId).get();
			AuthorDTO authorDTO = new AuthorDTO();
			BeanUtils.copyProperties(author, authorDTO);
			return authorDTO;
		} catch (Exception ex) {
			throw new AuthorServiceException();
		}
	}

	@Override
	public AuthorDTO createAuthor(AuthorDTO authorDTO) {
		try {
			Author author = new Author();
			BeanUtils.copyProperties(authorDTO, author);
			Author storedAuthor = authorRepository.save(author);
			AuthorDTO storedDTO = new AuthorDTO();
			BeanUtils.copyProperties(storedAuthor, storedDTO);
			return storedDTO;
		} catch (Exception ex) {
			throw new AuthorServiceException();
		}
	}
}
