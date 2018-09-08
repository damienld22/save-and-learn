package com.damienledantec.saveandlearn.litteratures;

import org.springframework.data.annotation.Id;
import utils.Category;

public class litterature {
	
	@Id private String id;
	
	private String title;
	private String description;
	private String link;
	private Category category;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}	
}
