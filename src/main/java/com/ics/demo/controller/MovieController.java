package com.ics.demo.controller;

import com.ics.demo.models.Movie;
import com.ics.demo.service.MovieService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// http:localhost:8080/movies
@RestController
@RequestMapping(value = "movies")
public class MovieController {

    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping
    public List<Movie> findAll(){
        return movieService.findAll();
    }

    @GetMapping(value = "{id}")
    public Movie findbyId(@PathVariable Long id){
        return movieService.findById(id);
    }
}
