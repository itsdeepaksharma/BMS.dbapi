package com.BMS.dbapi.repository;

import com.BMS.dbapi.Models.Bill;
import com.BMS.dbapi.Models.Hall;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface HallRepository extends JpaRepository<Hall, UUID> {
}
