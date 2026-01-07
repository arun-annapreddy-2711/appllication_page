package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="state_master")
@Data

public class StateEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer stateId;
    private String stateName;
    private Integer countryId;

}
