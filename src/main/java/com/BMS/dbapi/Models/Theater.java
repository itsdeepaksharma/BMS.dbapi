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
@Table(name = "Theaters")
public class Theater {

      @Id
      @GeneratedValue(strategy = GenerationType.AUTO)
      UUID id;

      String name;
      String address;
      int pincode;
      String state;

      @ManyToOne
      AppUser owner;



}
