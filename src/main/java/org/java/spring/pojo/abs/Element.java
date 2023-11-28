package org.java.spring.pojo.abs;

public abstract class Element {
	
	private int id;
	private String title;
	
	public Element(int id, String title) {
		setId(id);
		setTitle(title);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	
}