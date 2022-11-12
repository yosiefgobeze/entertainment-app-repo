package com.example.service;

import com.example.model.Movie;
import com.example.repository.MovieRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class MovieServiceImpl {

    private static final Logger LOGGER = LoggerFactory.getLogger(MovieServiceImpl.class);

    @Autowired
    private MovieRepository movieRepository;



    public String welcomeMsg() {
        LOGGER.info("*** inside welcomeMsg service ...");
        return "Welcome to Spring boot services / Entertainment application";
    }


    public ArrayList<Movie> getMovies() {
        LOGGER.info("*** inside getMovies service ...");
        ArrayList<Movie> movie = (ArrayList<Movie>)movieRepository.findAll();
        return movie;
    }


    public Movie getMovieById(String id) {
        LOGGER.info("*** inside getMovieById service ...");
        Optional<Movie> movie = movieRepository.findById(Integer.parseInt(id));
        return movie.get();
    }


    public String insertMovie(Movie movie) {
        LOGGER.info("*** inside insertMovie service ...");
        movieRepository.save(movie);
        return "*** Movie inserted successfully ...";
    }
}
