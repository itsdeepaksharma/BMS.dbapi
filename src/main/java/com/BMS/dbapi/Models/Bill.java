package com.BMS.dbapi.Models;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name="bills")
public class Bill {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    UUID billId;

    @ManyToOne
    AppUser user;

    @ManyToOne
    Show show;

    String seats;
    int TotalTickets;
    int totalAmount;

    LocalDateTime startTime;
    LocalDateTime endTime;
}
