package com.myown.employeeservice;


public class Employee {
    
    private String employeeId;
    private String fName;
    private String lName;

    public Employee() {
    }

    public Employee(String employeeId, String fName, String lName) {
        this.employeeId = employeeId;
        this.fName = fName;
        this.lName = lName;
    }

    public String getEmployeeId() {
        return this.employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getFName() {
        return this.fName;
    }

    public void setFName(String fName) {
        this.fName = fName;
    }

    public String getLName() {
        return this.lName;
    }

    public void setLName(String lName) {
        this.lName = lName;
    }

    public Employee employeeId(String employeeId) {
        setEmployeeId(employeeId);
        return this;
    }

    public Employee fName(String fName) {
        setFName(fName);
        return this;
    }

    public Employee lName(String lName) {
        setLName(lName);
        return this;
    }


    @Override
    public String toString() {
        return "{" +
            " employeeId='" + getEmployeeId() + "'" +
            ", fName='" + getFName() + "'" +
            ", lName='" + getLName() + "'" +
            "}";
    }

}
