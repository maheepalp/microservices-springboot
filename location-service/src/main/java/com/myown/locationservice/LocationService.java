package com.myown.locationservice;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/loc")
public class LocationService {
    @RequestMapping("/{locId}")
    public Address getEmployees(@PathVariable String locId){

        Address loc = new Address(locId, locId+" add line 1", locId+" city", "ON");
    
        return loc;
    }
}
