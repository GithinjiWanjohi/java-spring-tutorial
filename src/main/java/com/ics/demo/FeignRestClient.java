package com.ics.demo;

import com.ics.demo.models.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "client", url = "http://10.51.10.111:2000", configuration = FeignConfig.class)

public interface FeignRestClient {
//    @RequestMapping(method = RequestMethod.GET, value="movies")
//    List<Movie> getAllMovies();
//
//    @RequestMapping(method = RequestMethod.GET, value = "movies/{id}")
//    Movie findById(@PathVariable(name="id")Long id);
//
//    @RequestMapping(method = RequestMethod.POST, value ="movies")
//    Movie createMovie(@RequestBody Movie movie);
//
//    @RequestMapping(method = RequestMethod.PATCH, value ="movies/{id}")
//    Movie updateMovie(@PathVariable(name = "id") Long id, @RequestBody Movie movie);


    /*
    *Mock CAT
    * */
//    @RequestMapping(method = RequestMethod.GET, value = "students/{id}")
//    Student findStudentById(@PathVariable(name = "student_id") Long id);
//
//    @RequestMapping(method = RequestMethod.GET, value="lecturers")
//    List<Teacher> getAllTeachers();
//
//    @RequestMapping(method = RequestMethod.GET, value="appointments")
//    List<Appointment> getAllAppointments();
//
//    @RequestMapping(method = RequestMethod.POST, value ="students", consumes = "application/json")
//    Student createStudent(@RequestBody Student student);
//
//    @RequestMapping(method = RequestMethod.POST, value ="appointments", consumes = "application/json")
//    Appointment createAppointment(@RequestBody Appointment appointment);
//
//    @RequestMapping(method = RequestMethod.PATCH, value ="appointments/{appointmentId}", consumes = "application/json")
//    Appointment updateAppointment(@PathVariable(name = "appointmentId") Long id, @RequestParam(name = "studentId") Long studentId);

    /**
    * CAT
    * */
    @RequestMapping(method = RequestMethod.POST, value ="students")
    Student createStudentCAT(@RequestBody StudentCAT student);

    @RequestMapping(method = RequestMethod.POST, value ="companies/{companyId}/attachments")
    AttachmentCAT createAttachment(@PathVariable(name = "companyId") Long companyID, @RequestParam(name = "studentId") Long studentID);

    @RequestMapping(method = RequestMethod.PATCH, value ="companies/{companyId}/attachments")
    AttachmentCAT requestDepartment(@PathVariable(name = "companyId") Long companyID,
                                    @RequestParam(name = "studentId") Long studentID,
                                    @RequestParam(name = "departmentId") Long departmentId);

    @RequestMapping(method = RequestMethod.DELETE, value = "departments")
    DepartmentCAT deleteRequest(@RequestBody DepartmentCAT departmentCAT);
}
