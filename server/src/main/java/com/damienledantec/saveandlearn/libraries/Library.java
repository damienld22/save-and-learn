package com.damienledantec.saveandlearn.libraries;

import org.springframework.data.annotation.Id;
import utils.Category;

public class Library {
	
	@Id private String id;
	
	private String name;
	private String description;
	private Category category;
	private String link;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
}
