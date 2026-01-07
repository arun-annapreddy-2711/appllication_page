package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Data
public class StudentForm {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;
    private String email;
    private String password;
    private String isUpdPassword;
    private long number;
    @ManyToOne
    @JoinColumn(name="country_id")
    private CountryEntity country;
    @ManyToOne
    @JoinColumn(name="state_id")
    private StateEntity state;
    @ManyToOne
    @JoinColumn(name="city_id")
    private CityEntity city;

    @CreationTimestamp
    @Column(name="created_time",updatable = false)
    private String createTime;
    @UpdateTimestamp
    @Column(name="updated_time",insertable = false)
    private String UpdatedTime;

}
