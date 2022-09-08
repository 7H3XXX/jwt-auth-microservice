package com.bezkoder.spring.security.postgresql.controllers;

import com.bezkoder.spring.security.postgresql.models.ERole;
import com.bezkoder.spring.security.postgresql.models.Role;
import com.bezkoder.spring.security.postgresql.models.User;
import com.bezkoder.spring.security.postgresql.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = "/api/users")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/admin")
    public List <User> getAllAdminsByAgency(@RequestParam("agency") String agency){
        Role role = new Role();
        role.setId(3);
        role.setName(ERole.ROLE_ADMIN);
        return userRepository.findAllByRoleAndAgencyName(role,agency);
    }

}
