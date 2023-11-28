package org.java.spring.controller;

import java.util.ArrayList;
import java.util.List;

import org.java.spring.pojo.Movie;
import org.java.spring.pojo.Song;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	List<Movie> bestMovies = new ArrayList<>();
	List<Song> bestSongs = new ArrayList<>();
	
	
	@GetMapping("/")
	public String page1(Model model) {
		
		final String username = "Darth Vader";
		
		model.addAttribute("username", username);
		
		return "page1";
	}
	
	//methods
	private void setBestMovies() {
		
		bestMovies.add(new Movie(1, "Star Wars"));
		bestMovies.add(new Movie(2, "The Godfather"));
		bestMovies.add(new Movie(3, "The Dark Knight"));
		bestMovies.add(new Movie(4, "Pulp Fiction"));
		bestMovies.add(new Movie(5, "The Lord of the Rings: The Return of the King"));
		bestMovies.add(new Movie(6, "The Hobbit"));
		bestMovies.add(new Movie(7, "Aladdin"));
		bestMovies.add(new Movie(8, "Inception"));
		bestMovies.add(new Movie(9, "The Matrix"));
		bestMovies.add(new Movie(10, "The Silence of the Lambs"));
	}
	
	
	private List<Movie> getBestMovies() {
		
		return bestMovies;
	}
	
	private void setBestSongs() {
		
		bestSongs.add(new Song(1, "Bohemian Rhapsody"));
		bestSongs.add(new Song(2, "Imagine"));
		bestSongs.add(new Song(3, "Like a Rolling Stone"));
        bestSongs.add(new Song(4, "Billie Jean"));
        bestSongs.add(new Song(5, "Smells Like Teen Spirit"));
        bestSongs.add(new Song(6, "Hey Jude"));
        bestSongs.add(new Song(7, "Purple Haze"));
        bestSongs.add(new Song(8, "Stairway to Heaven"));
        bestSongs.add(new Song(9, "What's Going On"));
        bestSongs.add(new Song(10, "Hotel California"));
	}
	
	private List<Song> getBestSongs() {
		
		return bestSongs;
	}

}
