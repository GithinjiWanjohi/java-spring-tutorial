package com.ics.demo;

import com.ics.demo.models.Category;
import com.ics.demo.models.Movie;
import com.ics.demo.repositories.CategoryRepository;
import com.ics.demo.repositories.MovieRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class DumDum implements CommandLineRunner {

    private final MovieRepository movieRepository;
    private final CategoryRepository categoryRepository;

    public DumDum(MovieRepository movieRepository, CategoryRepository categoryRepository) {
        this.movieRepository = movieRepository;
        this.categoryRepository = categoryRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Category category = categoryRepository.save(new Category("Comedy"));
        Category category1 = categoryRepository.save(new Category("Thriller"));



        Movie movie = new Movie("Dumb and Dumber", "2019", category);
        category.addMovie(movie);
        categoryRepository.save(category);
        movieRepository.save(movie);


        Movie movie2 = new Movie("The Cleverest", "2007", category);
        category.addMovie(movie);
        categoryRepository.save(category);
        movieRepository.save(movie2);
    }
}
