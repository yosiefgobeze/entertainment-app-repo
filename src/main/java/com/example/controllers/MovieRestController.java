package com.example.controllers;

import com.example.service.MovieService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
@CrossOrigin(maxAge = 3600)
public class MovieRestController {

    private static final Logger LOGGER = (Logger) LoggerFactory.getLogger(MovieRestController.class);

    @Autowired
    MovieService movieService;

}
