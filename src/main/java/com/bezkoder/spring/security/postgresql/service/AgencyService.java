package com.bezkoder.spring.security.postgresql.service;

import com.bezkoder.spring.security.postgresql.models.Agency;
import com.bezkoder.spring.security.postgresql.repository.AgencyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgencyService {

    @Autowired
    AgencyRepository agencyRepository;

    /***
     * Get all agencies
     * @return agency list
     * */
    public List<Agency> getAllAgencies(){
        return agencyRepository.findAll();
    }

    /***
     * Get all agencies by city
     * @return agency list by citu
     * */
    public List<Agency> getAgenciesByCity(String city){
        return agencyRepository.findByCity(city);
    }
}
