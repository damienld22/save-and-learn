package com.damienledantec.saveandlearn.snippets;

import java.io.File;
import org.springframework.data.annotation.Id;
import utils.Category;

public class Snippet {
	@Id private String id;
	
	private String title;
	private String description;
	private File file;
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
	public File getFile() {
		return file;
	}
	public void setFile(File file) {
		this.file = file;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
}
