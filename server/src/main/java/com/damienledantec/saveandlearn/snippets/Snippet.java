package com.damienledantec.saveandlearn.snippets;

import java.io.File;
import org.springframework.data.annotation.Id;
import org.springframework.lang.Nullable;

import lombok.Data;
import utils.Category;

@Data
public class Snippet {
	@Id private String id;
	
	private String title;
	@Nullable
	private String description;
	private File file;
	@Nullable
	private Category category;
}
