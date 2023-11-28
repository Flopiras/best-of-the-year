package org.java.spring.pojo;

import org.java.spring.pojo.abs.Element;

public class Song extends Element{

	public Song(int id, String title) {
		super(id, title);
		
	}
	
	@Override
	public String toString() {

		return "SONG \n" 
				+ "ID " + getId()
				+ "TITLE " + getTitle();	
	}

}
