package com.example.cbd.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.cbd.entity.Blog;
import com.example.cbd.services.BlogService;

@Controller
@RequestMapping("/blog")
public class BlogController {

	@Autowired
	private BlogService blogService;

	@GetMapping
	String index(Model model) {
		List<Blog> blogList = blogService.findAll();
		model.addAttribute("blogList", blogList);
		return "blog/index";
	}

	@GetMapping("{id}")
	public String show(@PathVariable Long id, Model model) {
		model.addAttribute("blog", blogService.findOne(id));
		return "blog/show";
	}

	@GetMapping("new")
	public String newItem(@ModelAttribute("blog") Blog blog, Model model) {
		return "blog/new";
	}

	@GetMapping("{id}/edit")
	public String edit(@PathVariable Long id, @ModelAttribute("blog") Blog blog, Model model) {
		model.addAttribute("blog", blogService.findOne(id));
		return "blog/edit";
	}

	// new
	@PostMapping
	public String create(@Validated @ModelAttribute("blog") Blog blog, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "blog/new";
		} else {
			blogService.save(blog);
			return "redirect:/blog";
		}
	}

	// update
	@PostMapping("{id}")
	public String update(@PathVariable Long id, @Validated @ModelAttribute("blog") Blog blog, BindingResult result, Model model) {
		if (result.hasErrors()) {
			model.addAttribute("blog", blog);
			return "blog/edit";
		} else {
			blog.setId(id);
			blogService.update(blog);
			return "redirect:/blog";
		}
	}

	// delete
	@PostMapping("{id}/delete")
	public String delete(@PathVariable Long id) {
		blogService.delete(id);
		return "redirect:/blog";
	}
}
