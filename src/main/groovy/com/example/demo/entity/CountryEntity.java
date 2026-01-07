package com.example.demo.entity;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="country_master")
@Data
public class CountryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer countryId;
    private String countryName;


}
