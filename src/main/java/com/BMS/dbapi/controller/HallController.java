package com.BMS.dbapi.controller;

import com.BMS.dbapi.Models.Hall;
import com.BMS.dbapi.repository.HallRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/db/hall")
public class HallController {

    @Autowired
    private HallRepository hallRepository;

    @PostMapping("/create")
    public ResponseEntity createHall(@RequestBody Hall hall) {
        hallRepository.save(hall);
        return new ResponseEntity(hall, HttpStatus.CREATED);
    }

    @GetMapping("/{UserId}")
    public ResponseEntity getHallById(@PathVariable UUID hallId){
        Hall hall = hallRepository.findById(hallId).orElse(null);
        return new ResponseEntity(hall, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity updateHall(@RequestBody Hall hall){
        hallRepository.save(hall);
        return  new ResponseEntity(hall, HttpStatus.CREATED);
    }

    @DeleteMapping("/delete")
    public ResponseEntity deleteUserById(@PathVariable UUID hallId){
        hallRepository.deleteById(hallId);
        return new ResponseEntity("Hall deleted successfully", HttpStatus.NO_CONTENT);
    }
}
