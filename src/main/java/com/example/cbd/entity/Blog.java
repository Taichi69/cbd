package com.example.cbd.entity;

import java.sql.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class Blog {
	private Long id;
	@NotBlank(message = "名前を入力してください")
	@Size(max=30, message="名前は30文字を超えないでください。")
	private String name;
	@NotBlank(message = "タイトルを入力してください")
	@Size(max=30, message="タイトルは30文字を超えないでください。")
	private String title;
	private Date created_date;
	@NotBlank(message = "内容を入力してください")
	@Size(max=10000, message="10000文字を超えないでください。")
	private String content;
	private String image;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public Date getCreated_date() {
		return created_date;
	}
	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}

	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
}
