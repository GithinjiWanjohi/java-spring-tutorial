package com.ics.demo;

import com.ics.demo.models.Movie;
import com.ics.demo.repositories.MovieRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DumDum implements CommandLineRunner {

    private final MovieRepository movieRepository;

    public DumDum(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Movie movie = new Movie("Dumb and Dumber", "2019");

        Movie movie2 = new Movie("The Cleverest", "2007");

        movieRepository.save(movie);
        movieRepository.save(movie2);
    }
}
