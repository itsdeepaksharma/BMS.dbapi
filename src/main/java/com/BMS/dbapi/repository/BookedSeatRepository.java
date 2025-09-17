package com.BMS.dbapi.repository;

import com.BMS.dbapi.Models.BookedSeat;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BookedSeatRepository extends JpaRepository<BookedSeat, UUID> {
}
