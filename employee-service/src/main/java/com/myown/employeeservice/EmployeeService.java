package com.myown.employeeservice;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/empl")
public class EmployeeService {

    @RequestMapping("/{emplId}")
    public Employee getEmployees(@PathVariable String emplId){

        Employee empl=new Employee(emplId, emplId+"fName",emplId+"lName");
    
        return empl;
    }
    
}
