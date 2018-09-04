package com.damienledantec.saveandlearn.bestPractices;

import org.springframework.data.annotation.Id;
import org.springframework.lang.Nullable;

import lombok.Data;
import utils.Category;


public class BestPractice {
	
	@Id private String id;
	
	private String title;
	private String content;
	private Category category;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
}
