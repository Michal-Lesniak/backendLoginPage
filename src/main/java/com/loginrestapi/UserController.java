package com.loginrestapi;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
public class UserController {


    @Autowired
    private usersRepository usersRepository;

    @PostMapping("/login")
    public boolean UserLogin(@RequestBody userCredentials user){
        return usersRepository.existsUsersByUsernameAndPassword(user.getUsername(), user.getPassword());
    }

    @GetMapping("/home")
    public ResponseEntity<users> getUserData(){
        return ResponseEntity.ok(usersRepository.findUsersByUsername("michalles1"));
    }

    @PostMapping("/sign-up")
    public boolean registerUser(@RequestBody users user){
        usersRepository.save(user);
        return usersRepository.existsUsersByUsername(user.getUsername());
    }
}
