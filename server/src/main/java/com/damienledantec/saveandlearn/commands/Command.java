package com.damienledantec.saveandlearn.commands;

import org.springframework.data.annotation.Id;
import utils.Category;

public class Command {

	@Id private String id;
	
	private String command;
	private String description;
	private Category category;
	
	public String getCommand() {
		return command;
	}
	public void setCommand(String command) {
		this.command = command;
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
}
