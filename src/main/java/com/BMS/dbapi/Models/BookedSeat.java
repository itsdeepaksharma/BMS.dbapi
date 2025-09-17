package com.BMS.dbapi.Models;


import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name="bookedseats")
public class BookedSeat {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
UUID id;
UUID showId;

int seatNumber;



}
