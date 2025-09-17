package com.BMS.dbapi.repository;

import com.BMS.dbapi.Models.Theater;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TheaterRepository extends JpaRepository<Theater, UUID> {
}
