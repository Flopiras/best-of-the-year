package org.java.spring.controller;

import java.util.ArrayList;
import java.util.List;

import org.java.spring.pojo.Movie;
import org.java.spring.pojo.Song;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

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

	@GetMapping("/movies")
	public String pageMovies(Model model) {
		setBestMovies();

		List<Movie> movies = getBestMovies();

		model.addAttribute("movies", movies);

		return "movies";
	}

	@GetMapping("/songs")
	public String pageSongs(Model model) {
		setBestSongs();

		List<Song> songs = getBestSongs();

		model.addAttribute("songs", songs);

		return "songs";
	}

	@GetMapping("/movies/{id}")
	public String movieDetail(Model model, @PathVariable int id) {

		Movie m = getMovieFromList(id);

		model.addAttribute("id", id);
		model.addAttribute("title", m != null ? m.getTitle() : "Movie not found!");

		return "movieDetail";
	}
	
	@GetMapping("/songs/{id}")
	public String songDetail(Model model, @PathVariable int id) {

		Song m = getSongFromList(id);

		model.addAttribute("id", id);
		model.addAttribute("title", m != null ? m.getTitle() : "Song not found!");

		return "songDetail";
	}

	// methods
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

	private Movie getMovieFromList(int id) {

		setBestMovies();

		List<Movie> bestMovies = getBestMovies();

		for (Movie movie : bestMovies) {
			if (movie.getId() == id) {
				return movie;
			}
		}
		return null;
	}

	private Song getSongFromList(int id) {

		setBestSongs();

		List<Song> bestSongs = getBestSongs();

		for (Song song : bestSongs) {
			if (song.getId() == id) {
				return song;
			}
		}
		return null;
	}

}
