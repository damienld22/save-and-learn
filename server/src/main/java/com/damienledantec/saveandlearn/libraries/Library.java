package com.damienledantec.saveandlearn.libraries;

import org.springframework.data.annotation.Id;
import org.springframework.lang.Nullable;

import lombok.Data;
import utils.Category;

@Data
public class Library {
	
	@Id private String id;
	
	private String name;
	@Nullable
	private String description;
	@Nullable
	private Category category;
	private String link;
}
