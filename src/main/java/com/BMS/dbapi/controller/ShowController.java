package com.BMS.dbapi.controller;

import com.BMS.dbapi.Models.Show;
import com.BMS.dbapi.repository.ShowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/db/show")
public class ShowController {

    @Autowired
    private ShowRepository showRepository;


    @PostMapping("/create")
    public ResponseEntity createShow(@RequestBody Show show) {
        showRepository.save(show);
        return new ResponseEntity(show, HttpStatus.CREATED);
    }


    @GetMapping("/{showId}")
    public ResponseEntity getShowById(@PathVariable UUID showId) {
        Show show = showRepository.findById(showId).orElse(null);
        if (show == null) {
            return new ResponseEntity("Show not found", HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity(show, HttpStatus.OK);
    }


    @PutMapping("/update")
    public ResponseEntity updateShow(@RequestBody Show show) {
        showRepository.save(show);
        return new ResponseEntity(show, HttpStatus.OK);
    }


    @DeleteMapping("/{showId}")
    public ResponseEntity deleteShow(@PathVariable UUID showId) {
        if (!showRepository.existsById(showId)) {
            return new ResponseEntity("Show not found", HttpStatus.NOT_FOUND);
        }
        showRepository.deleteById(showId);
        return new ResponseEntity("Show deleted successfully", HttpStatus.NO_CONTENT);
    }
}
