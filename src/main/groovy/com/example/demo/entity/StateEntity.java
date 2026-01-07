package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="state_master")
@Data

public class StateEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JoinColumn(name="state_id")
    private Integer stateId;
    @Column(name="state_name")
    private String stateName;
    private Integer countryId;

}
