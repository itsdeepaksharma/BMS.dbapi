package com.BMS.dbapi.controller;

import com.BMS.dbapi.Models.BookedSeat;
import com.BMS.dbapi.repository.BookedSeatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/db/bookedseat")
public class BookedSeatController {

    @Autowired
    private BookedSeatRepository bookedSeatRepository;


    @PostMapping("/create")
    public ResponseEntity createBookedSeat(@RequestBody BookedSeat bookedSeat) {
        bookedSeatRepository.save(bookedSeat);
        return new ResponseEntity(bookedSeat, HttpStatus.CREATED);
    }


    @GetMapping("/{seatId}")
    public ResponseEntity getBookedSeatById(@PathVariable UUID seatId) {
        BookedSeat seat = bookedSeatRepository.findById(seatId).orElse(null);
        if (seat == null) {
            return new ResponseEntity("Booked Seat not found", HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity(seat, HttpStatus.OK);
    }

    // UPDATE BOOKED SEAT
    @PutMapping("/update")
    public ResponseEntity updateBookedSeat(@RequestBody BookedSeat bookedSeat) {
        bookedSeatRepository.save(bookedSeat);
        return new ResponseEntity(bookedSeat, HttpStatus.OK);
    }


    @DeleteMapping("/{seatId}")
    public ResponseEntity deleteBookedSeat(@PathVariable UUID seatId) {
        bookedSeatRepository.deleteById(seatId);
        return new ResponseEntity("Booked Seat deleted successfully", HttpStatus.NO_CONTENT);
    }
}
