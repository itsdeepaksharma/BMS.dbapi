package com.BMS.dbapi.repository;

import com.BMS.dbapi.Models.Bill;
import com.BMS.dbapi.Models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface MovieRepository extends JpaRepository<Movie, UUID> {
}
