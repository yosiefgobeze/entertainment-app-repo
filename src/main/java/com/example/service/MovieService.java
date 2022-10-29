package com.example.service;

import com.example.model.Movie;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public interface MovieService {

    String welcomeMsg();
    public ArrayList<Movie> getMovies();
    public Movie getMovieById(String id);
    public String insertMovie(Movie movie);

    // you can add methods to update, delete and so on...
}
