package com.myown.departmentservice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/dept")
public class DepartmentService {

    @Autowired
    RestTemplate template;

    private static final String [] emplCodes = {"101", "102"};
    private static final String [] locCodes = {"loc1", "loc2"};


    @RequestMapping("/{deptId}")
    public Department getEmployees(@PathVariable String deptId){

        Department dept = new Department();

        List<Employee> employees = new ArrayList<>();

        for(String emplId : emplCodes){
            employees.add(
                //template.getForObject("http://localhost:8888/empl/"+emplId, Employee.class)
                template.getForObject("http://EMPL-SERVICE/empl/"+emplId, Employee.class)
            );
        }
        dept.setEmployees(employees);

        List<Address> locations = new ArrayList<>();

        for(String locId : locCodes){
            locations.add(
                //template.getForObject("http://localhost:9999/loc/"+locId, Address.class)
                template.getForObject("http://LOCATION-SERVICE/loc/"+locId, Address.class)
            );
        }
        dept.setLocations(locations);

        
        return dept;

    }
    
}
