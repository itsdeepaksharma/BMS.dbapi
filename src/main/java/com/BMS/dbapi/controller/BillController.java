package com.BMS.dbapi.controller;

import com.BMS.dbapi.Models.Bill;
import com.BMS.dbapi.repository.BillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/db/bill")
public class BillController {

    @Autowired
    private BillRepository billRepository;

    // CREATE BILL
    @PostMapping("/create")
    public ResponseEntity createBill(@RequestBody Bill bill) {
         billRepository.save(bill);
        return new ResponseEntity(bill, HttpStatus.CREATED);
    }

    // GET BILL BY ID
    @GetMapping("/{billId}")
    public ResponseEntity getBillById(@PathVariable UUID billId) {
        Bill bill = billRepository.findById(billId).orElse(null);
        if (bill== null) {
            return new ResponseEntity("Bill not found", HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity(billId, HttpStatus.OK);
    }

    // UPDATE BILL
    @PutMapping("/update")
    public ResponseEntity updateBill(@RequestBody Bill bill) {
        billRepository.save(bill);
        return new ResponseEntity(bill, HttpStatus.OK);
    }

    // DELETE BILL
    @DeleteMapping("/{billId}")
    public ResponseEntity deleteBill(@PathVariable UUID billId) {
        billRepository.deleteById(billId);
        return new ResponseEntity("Bill deleted successfully", HttpStatus.NO_CONTENT);
    }
}
