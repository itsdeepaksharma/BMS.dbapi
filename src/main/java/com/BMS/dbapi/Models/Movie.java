package com.BMS.dbapi.Models;

import jakarta.persistence.*;
import lombok.*;
import java.util.UUID;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Table(name="movies")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    UUID id;

    String name;
    Double duration; // It will be in hours.
    boolean isReleased;

    @ManyToOne
    AppUser movieOwner;

    int review;
    int totalReviewVotes;
    String language;


}
