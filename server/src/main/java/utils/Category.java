package utils;

public enum Category {
	Network("network"),
	System("system"),
	General("general"),
	Utils("utils"),
	Testing("testing"),
	Front("front"),
	Back("back");
	
	private String name = "";
	
	Category(String name){
		this.name = name;
	}
}
