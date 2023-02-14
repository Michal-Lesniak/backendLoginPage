package com.loginrestapi;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class UserController {



    @Autowired
    private usersRepository usersRepository;

    @GetMapping("/user/{username}/{password}")
    public boolean UserLogin(@PathVariable("username") String username,
                             @PathVariable("password") String password){
        return usersRepository.existsUsersByUsernameAndPassword(username, password);
    }
}
