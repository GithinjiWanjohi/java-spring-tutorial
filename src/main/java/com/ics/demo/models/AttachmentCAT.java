package com.ics.demo.models;

public class AttachmentCAT {

    private Long companyId;
    private String name;

    private Long departmentID;


    public AttachmentCAT(Long companyId) {
        this.companyId = companyId;
    }


    public Long getDepartmentID() {
        return departmentID;
    }


    public void setDepartmentID(Long departmentID) {
        this.departmentID = departmentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
}
