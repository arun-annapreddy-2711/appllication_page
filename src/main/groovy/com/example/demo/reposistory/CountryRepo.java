package com.example.demo.reposistory;

import com.example.demo.entity.CountryEntity;
import com.example.demo.entity.StateEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepo extends JpaRepository<CountryEntity,Integer> {
}
