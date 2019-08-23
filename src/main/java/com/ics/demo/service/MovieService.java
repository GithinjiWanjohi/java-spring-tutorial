package com.ics.demo.service;

import com.ics.demo.models.Movie;

import java.util.List;

public interface MovieService {
    List<Movie> findAll();

    Movie findById(Long id);
}
