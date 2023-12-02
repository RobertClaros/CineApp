package com.cineApp.service;

import com.cineApp.entity.Movie;

import java.util.List;

public interface IMovieService {
    public List<Movie> moviesList();
    public Movie findMovieById(Long id);
    public void deleteMovieById(Long id);
    public Movie saveMovie(Movie movie);

}
