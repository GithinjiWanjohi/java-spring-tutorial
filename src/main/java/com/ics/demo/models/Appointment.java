package com.ics.demo.models;


public class Appointment {

//    private Long appointmentId;
    private Long studentId;
    private Long teacherId;
    private boolean confirmed;

    public Appointment(Long studentId, Long teacherId) {
        this.studentId = studentId;
        this.teacherId = teacherId;
    }

//    public long getAppointmentId() {
//        return appointmentId;
//    }

//    public void setAppointmentId(long appointmentId) {
//        this.appointmentId = appointmentId;
//    }

    public boolean isConfirmed() {
        return confirmed;
    }

    public void setConfirmed(boolean confirmed) {
        this.confirmed = confirmed;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "studentId=" + studentId +
                ", teacherId=" + teacherId +
                ", confirmed=" + confirmed +
                '}';
    }
}
