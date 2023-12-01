package com.cineApp.controller;

import com.cineApp.entity.Movie;
import com.cineApp.service.IMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("movie")
public class MovieController {

    @Autowired
    private IMovieService movieService;

    @GetMapping("/")
    public List<Movie> findAll(){
        List<Movie> movieList = new ArrayList<>();
        movieList = movieService.moviesList();
        return  movieList;
    }

    @PostMapping("/")
    public Movie saveMovie(Movie movie){
        return movieService.saveMovie(movie);
    }

    @GetMapping("/{id}")
    public Movie findMovieById(@PathVariable  Long id){

        return movieService.findMovieById(id);
    }
    @DeleteMapping("/{id}")
    public void deleteMovieById(@PathVariable  Long id){
        movieService.deleteMovieById(id);
    }

    @PutMapping("/{id}")
    public Movie updateMovie(@PathVariable Long id, Movie movie){
        Movie movieUpdate = movieService.findMovieById(id);
        movieUpdate.setTitle(movie.getTitle());
        movieUpdate.setDirector(movie.getDirector());
        movieUpdate.setGenre(movie.getGenre());
        return movieService.saveMovie(movieUpdate);
    }
}
