package com.BMS.dbapi.Models;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Table(name="users")
@Getter  //
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class AppUser {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

  // UUID -  Universally Unique Identifier. 36 alphanumeric string.
    UUID id; // base64 type id basically it generated automatically depending on the current time.

    String name;

    @Column(unique = true)
    String email;

    String password;

    @Column(unique = true)
    Long phoneNumber;

    String address;
    int pincode;
    String state;
    String userType;



}
