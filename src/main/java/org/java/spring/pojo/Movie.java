package org.java.spring.pojo;

import org.java.spring.pojo.abs.Element;

public class Movie extends Element{

	public Movie(int id, String title) {
		super(id, title);
		
	}
	
	@Override
	public String toString() {

		return "MOVIE \n" 
				+ "ID " + getId()
				+ "TITLE " + getTitle();	
	}

}
