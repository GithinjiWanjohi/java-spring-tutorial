package com.ics.demo.models;

public class DepartmentCAT {

    private Long id;
    private Long studentId;
    private Long companyId;

    public DepartmentCAT(Long id, Long studentId, Long companyId) {
        this.id = id;
        this.studentId = studentId;
        this.companyId = companyId;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
