package com.damienledantec.saveandlearn.litteratures;

import org.springframework.data.annotation.Id;
import org.springframework.lang.Nullable;

import lombok.Data;
import utils.Category;

@Data
public class litterature {
	
	@Id private String id;
	
	private String title;
	@Nullable
	private String description;
	private String link;
	@Nullable
	private Category category;	
}
