package com.myown.departmentservice;

import java.util.ArrayList;
import java.util.List;

public class Department {

    List<Employee> employees = new ArrayList<Employee>();
    List<Address> locations = new ArrayList<Address>();

    public Department() {
    }


    public Department(List<Employee> employees, List<Address> locations) {
        this.employees = employees;
        this.locations = locations;
    }

    public List<Employee> getEmployees() {
        return this.employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Address> getLocations() {
        return this.locations;
    }

    public void setLocations(List<Address> locations) {
        this.locations = locations;
    }

    @Override
    public String toString() {
        return "{" +
            " employees='" + getEmployees() + "'" +
            ", locations='" + getLocations() + "'" +
            "}";
    }
 
    
}
