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
@Table(name="shows")
public class Show {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    UUID id;

    @ManyToOne
    Hall hall;

    @ManyToOne
    Movie movie;

    Long startTime;
    Long endEndtime;

}
