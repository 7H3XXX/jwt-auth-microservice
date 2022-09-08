package com.bezkoder.spring.security.postgresql.service;

import com.bezkoder.spring.security.postgresql.models.User;
import com.bezkoder.spring.security.postgresql.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


//    public List<User> getAdminsbyAgency(String agency){
//        userRepository;
//        return null;
//    }
}
