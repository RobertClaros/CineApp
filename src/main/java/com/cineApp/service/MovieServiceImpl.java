package com.cineApp.service;

import com.cineApp.entity.Movie;
import com.cineApp.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieServiceImpl implements IMovieService {

    @Autowired
    private MovieRepository movieRepository;
    @Override
    public List<Movie> moviesList() {
        List<Movie> listMovie = new ArrayList<>() ;
        listMovie = movieRepository.findAll();
        return listMovie;
    }
    @Override
    public Movie findMovieById(Long id) {
        return movieRepository.findById(id).orElseThrow();
    }
    @Override
    public void deleteMovieById(Long id) {
        movieRepository.deleteById(id);
    }
    @Override
    public Movie saveMovie(Movie movie) {
        return movieRepository.save(movie);
    }
}
