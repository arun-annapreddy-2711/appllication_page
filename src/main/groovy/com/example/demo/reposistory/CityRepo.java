package com.example.demo.reposistory;

import com.example.demo.entity.CityEntity;
import com.example.demo.entity.StateEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepo extends JpaRepository<CityEntity,Integer> {
}
