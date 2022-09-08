package com.bezkoder.spring.security.postgresql.controllers;

import com.bezkoder.spring.security.postgresql.models.Agency;
import com.bezkoder.spring.security.postgresql.service.AgencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = "/api/users")
public class AgencyController {

    @Autowired
    AgencyService agencyService;

    @GetMapping(value = "agencies")
    public List<Agency> getAllAgencies(){
        return agencyService.getAllAgencies();
    }

    @GetMapping(value = "{city}/agencies")
    public List<Agency> getAgenciesByCity(@PathVariable String city){
        return agencyService.getAgenciesByCity(city);
    }
}
