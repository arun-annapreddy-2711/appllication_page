package com.example.demo.reposistory;

import com.example.demo.entity.CountryEntity;
import com.example.demo.entity.StateEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CountryRepo extends JpaRepository<CountryEntity,Integer> {
    Optional<CountryEntity> findByCountryName(String countryName);

}
