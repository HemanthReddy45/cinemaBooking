package com.cinemaeBooking.business;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cinemaeBooking.entities.Movie;
import com.cinemaeBooking.service.UserMovieService;

@Service
public class UserMovieDetails {
    @Autowired
    UserMovieService userMovieService;

    public Set<Movie> getAllMovies() {
        Set<Movie> moviesList = new HashSet<Movie>();
        moviesList = userMovieService.getAllMovies();
        return moviesList;
    }

    public Set<Movie> getCurrentlyAndComingSoonMovies() {
        Set<Movie> moviesList = new HashSet<Movie>();
        moviesList = userMovieService.getCurrentlyAndComingSoonMovies();
        return moviesList;
    }

    public Set<Movie> getComingSoonMovies() {
        Set<Movie> moviesList = new HashSet<Movie>();
        moviesList = userMovieService.getComingSoonMovies();
        return moviesList;
    }

    public Set<Movie> getCurrentMovies() {
        Set<Movie> moviesList = new HashSet<Movie>();
        moviesList = userMovieService.getCurrentMovies();
        return moviesList;
    }

    public Movie getMovieByTitle(String title) {
        Movie movie = null;
        movie = userMovieService.getMovieByTitle(title);
        return movie;
    }

    public Set<Movie> getMovieByCategory(String category) {
        Set<Movie> moviesList = new HashSet<Movie>();
        moviesList = userMovieService.getMovieByCategory(category);
        return moviesList;
    }
}
