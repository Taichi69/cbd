package com.example.cbd.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;

import com.example.cbd.entity.Blog;

@Mapper
public interface BlogMapper {
	
	List<Blog> findAll();
	
	Blog findOne(Long id);
	
	void save(Blog blog);
	
	void update(Blog blog);
	
	void delete(Long id);

}
