package com.ics.demo;

import com.ics.demo.models.Appointment;
import com.ics.demo.models.Movie;
import com.ics.demo.models.Student;
import com.ics.demo.models.Teacher;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "client", url = "http://10.55.32.135:1000")
public interface FeignRestClient {
    @RequestMapping(method = RequestMethod.GET, value="movies")
    List<Movie> getAllMovies();

    @RequestMapping(method = RequestMethod.GET, value = "movies/{id}")
    Movie findById(@PathVariable(name="id")Long id);

    @RequestMapping(method = RequestMethod.POST, value ="movies")
    Movie createMovie(@RequestBody Movie movie);

    @RequestMapping(method = RequestMethod.PATCH, value ="movies/{id}")
    Movie updateMovie(@PathVariable(name = "id") Long id, @RequestBody Movie movie);


    /*
    *Mock CAT
    * */
    @RequestMapping(method = RequestMethod.GET, value = "students/{id}")
    Student findStudentById(@PathVariable(name = "student_id") Long id);

    @RequestMapping(method = RequestMethod.GET, value="lecturers")
    List<Teacher> getAllTeachers();

    @RequestMapping(method = RequestMethod.GET, value="appointments")
    List<Appointment> getAllAppointments();

    @RequestMapping(method = RequestMethod.POST, value ="students", consumes = "application/json")
    Student createStudent(@RequestBody Student student);

    @RequestMapping(method = RequestMethod.POST, value ="appointments", consumes = "application/json")
    Appointment createAppointment(@RequestBody Appointment appointment);

    @RequestMapping(method = RequestMethod.PATCH, value ="appointments/{appointmentId}", consumes = "application/json")
    Appointment updateAppointment(@PathVariable(name = "appointmentId") Long id, @RequestParam(name = "studentId") Long studentId);
}
