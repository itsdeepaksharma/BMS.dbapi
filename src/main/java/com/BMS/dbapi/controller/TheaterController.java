package com.BMS.dbapi.controller;

import com.BMS.dbapi.Models.Theater;
import com.BMS.dbapi.repository.TheaterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/db/theater")
public class TheaterController {

    @Autowired
    private TheaterRepository theaterRepository;

    @PostMapping("/create")
    public ResponseEntity createTheater(@RequestBody Theater theater) {
        theaterRepository.save(theater);
        return new ResponseEntity(theater, HttpStatus.CREATED);
    }


    @GetMapping("/{theaterId}")
    public ResponseEntity getTheaterById(@PathVariable UUID theaterId) {
        Theater theater = theaterRepository.findById(theaterId).orElse(null);
        return new ResponseEntity(theater, HttpStatus.OK);
    }


    @PutMapping("/update")
    public ResponseEntity updateTheater(@RequestBody Theater theater) {
        theaterRepository.save(theater);
        return new ResponseEntity(theater, HttpStatus.OK);
    }


    @DeleteMapping("/{theaterId}")
    public ResponseEntity deleteTheater(@PathVariable UUID theaterId) {
        theaterRepository.deleteById(theaterId);
        return new ResponseEntity("Theater deleted successfully", HttpStatus.NO_CONTENT);
    }
}
