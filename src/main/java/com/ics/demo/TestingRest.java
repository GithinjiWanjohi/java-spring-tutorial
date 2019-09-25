package com.ics.demo;

import com.ics.demo.models.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class TestingRest implements CommandLineRunner {

    private final FeignRestClient feignRestClient;

    public TestingRest(FeignRestClient feignRestClient) {
        this.feignRestClient = feignRestClient;
    }

    @Override
    public void run(String... args) throws Exception {

//        Movie newMovie = new Movie("Its Home Time", "2019");
//        newMovie = feignRestClient.createMovie(newMovie);
//        System.out.println("Created movie: " + newMovie.toString());
//
//        newMovie.setName("You Again");
//        newMovie.setYearReleased("2019");
//        feignRestClient.updateMovie(newMovie.getId(), newMovie);
//        System.out.println("Created movie: " + newMovie.toString());
//
//        RestTemplate restTemplate = new RestTemplate();
//
//        ResponseEntity<List<Movie>> response = restTemplate.exchange(
//                "http://10.51.10.111:9090/movies",
//                HttpMethod.GET,
//                null,
//                new ParameterizedTypeReference<List<Movie>>() {}
//        );
//        List<Movie> movies = response.getBody();
//        System.out.println(movies.toString());
//
//        Movie movie = restTemplate.getForObject(
//                "http://10.51.10.111:9090/movies/4",
//                Movie.class
//        );
//        System.err.println(movie.toString());
//
//        String url = "http://10.51.10.111:9090/movies/search?name=" +movie.getName();
//        Movie movieByName = restTemplate.getForObject(
//                url,
//                Movie.class
//        );
//        System.err.println(movie.toString());
//
//        movies = feignRestClient.getAllMovies();
//        System.err.println(movies);


//        Student newStudent = feignRestClient.createStudent(new Student(124343L, "Alfie"));
//        System.out.println("Created student: " + newStudent.toString());

//        Appointment newAppointment = feignRestClient.createAppointment(new Appointment(newStudent.getStudentNumber(), (long) 1));
//        System.out.println("Created appointment: " + newAppointment.toString());

//        feignRestClient.updateAppointment(newAppointment.getAppointmentId(), newStudent.getStudentNumber());
//        System.out.println("Created appointment: " + newAppointment.toString());


        /**
         * CAT 1
         * */

        Student studentNew = feignRestClient.createStudentCAT(new StudentCAT("92263", "Githinji"));

        AttachmentCAT attachmentCAT = feignRestClient.createAttachment(7L, 26L);

         feignRestClient.requestDepartment(attachmentCAT.getCompanyId(), studentNew.getStudentNumber(), 12L);

        feignRestClient.deleteRequest(new DepartmentCAT(10L,26L,7L));
    }
}
