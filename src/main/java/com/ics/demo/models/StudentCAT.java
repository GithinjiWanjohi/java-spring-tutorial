package com.ics.demo.models;

public class StudentCAT {

    private Long id;
    private String studentNumber;
    private String firstName;

    public StudentCAT(String studentNumber, String firstName) {
        this.studentNumber = studentNumber;
        this.firstName = firstName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return "StudentCAT{" +
                "studentNumber='" + studentNumber + '\'' +
                ", firstName='" + firstName + '\'' +
                '}';
    }
}
