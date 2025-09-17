package com.BMS.dbapi.controller;

import com.BMS.dbapi.Models.AppUser;
import com.BMS.dbapi.repository.AppUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/db/user")
public class AppUserController{

    @Autowired
    AppUserRepository appUserRepository;

    @PostMapping("/create")
    public ResponseEntity createUser(@RequestBody AppUser user){
        appUserRepository.save(user);
        return new ResponseEntity(user, HttpStatus.CREATED);
    }

    @GetMapping("/{userId}")
    public ResponseEntity getUserById(@PathVariable UUID userId){
          AppUser user = appUserRepository.findById(userId).orElse(null);
          return  new ResponseEntity(user, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity updateUserById(@RequestBody AppUser user){
       appUserRepository.save(user);
       return new ResponseEntity(user, HttpStatus.CREATED);
    }

    @DeleteMapping("/{userId}")
    public ResponseEntity deleteUserById(@PathVariable UUID userid){
        appUserRepository.deleteById(userid);
        return new ResponseEntity(null, HttpStatus.NO_CONTENT);

    }

}
