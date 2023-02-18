package com.loginrestapi;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RequestMapping("api/users")
@RestController
public class UserController {


    @Autowired
    private usersRepository usersRepository;

    @PostMapping("/verify")
    public boolean UserLogin(@RequestBody userCredentials user){
        return usersRepository.existsUsersByUsernameAndPassword(user.getUsername(), user.getPassword());
    }

    @GetMapping("/{username}")
    public ResponseEntity<users> getUserData(@PathVariable("username") String username){
        return ResponseEntity.ok(usersRepository.findUsersByUsername(username));
    }

    @PostMapping
    public boolean registerUser(@RequestBody users user){
        usersRepository.save(user);
        return usersRepository.existsUsersByUsername(user.getUsername());
    }
}
