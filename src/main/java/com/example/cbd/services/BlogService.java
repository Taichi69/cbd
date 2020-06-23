package com.example.cbd.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.cbd.entity.Blog;
import com.example.cbd.mapper.BlogMapper;

@Service
@Transactional
public class BlogService {
	
	@Autowired
	BlogMapper blogMapper;
	
	public List<Blog> findAll() {
		return blogMapper.findAll();
	}
	
	public Blog findOne(Long id) {
		return blogMapper.findOne(id);
	}
	
	public void save(Blog blog) {
		blogMapper.save(blog);
	}
	
	public void update(Blog blog) {
		blogMapper.update(blog);
	}
	
	public void delete(Long id) {
		blogMapper.delete(id);
	}
}
