package com.example.demo.reposistory;

import com.example.demo.entity.StateEntity;
import com.example.demo.entity.StudentForm;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepo extends JpaRepository<StateEntity,Integer> {
}
