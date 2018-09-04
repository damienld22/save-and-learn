package com.damienledantec.saveandlearn.commands;

import org.springframework.data.annotation.Id;
import org.springframework.lang.Nullable;

import lombok.Data;
import utils.Category;

@Data
public class Command {

	@Id private String id;
	
	private String command;
	@Nullable
	private String description;
	@Nullable
	private Category category;
}
