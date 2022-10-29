package com.example.controllers;

import com.example.model.Movie;
import com.example.service.MovieServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin(maxAge = 3600)
@RestController
public class MovieRestController {

    private static final Logger LOGGER = LoggerFactory.getLogger(MovieRestController.class);

    @Autowired
    private MovieServiceImpl movieServiceImpl; // the interface

    @CrossOrigin(origins = "*")
    @PostMapping(path = "insertMovie", consumes = "application/json")
    public String saveMovie(@RequestBody Movie movie){
        LOGGER.info("*** saveMovie action called ***");
        return movieServiceImpl.insertMovie(movie);
    }

    @CrossOrigin(origins = "*")
    @GetMapping(path = "/getMovie/{id}")
    public Movie getMovieById(@PathVariable String id){
        return movieServiceImpl.getMovieById(id);
    }

    @CrossOrigin(origins = "*")
    @GetMapping(path = "getMovies", produces = "application/json")
    public ArrayList<Movie> getMovies(){
        LOGGER.info("*** getMovies action called ***");
        return movieServiceImpl.getMovies();
    }

    @GetMapping(path = "/welcome")
    public String getWelcomeMsg(){
        LOGGER.info("*** getWelcomeMsg action called ***");
        return movieServiceImpl.welcomeMsg();
    }
}
