package com.example.demo.controller;

import com.example.demo.entity.CityEntity;
import com.example.demo.entity.CountryEntity;
import com.example.demo.entity.StateEntity;
import com.example.demo.reposistory.CityRepo;
import com.example.demo.reposistory.CountryRepo;
import com.example.demo.reposistory.StateRepo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CounStCy{

    private CountryRepo countryRepo;
    private StateRepo stateRepo;
    private CityRepo cityRepo;
    public CounStCy(CountryRepo countryRepo, CityRepo cityRepo, StateRepo stateRepo){

        this.countryRepo=countryRepo;
        this.stateRepo=stateRepo;
        this.cityRepo=cityRepo;
    }

    @PostMapping("/country")
    public CountryEntity countryDataPost(@RequestBody CountryEntity countryEntity){
        return countryRepo.findByCountryName(countryEntity.getCountryName()).orElseGet(()->countryRepo.save(countryEntity));
    }

    @GetMapping("/country")
    public List<CountryEntity> countryData(){
        return countryRepo.findAll();
    }

    @GetMapping("/state")
    public List<StateEntity> stateData(){
        return stateRepo.findAll();
    }
    @GetMapping("/city")
    public List<CityEntity> cityData(){
        return cityRepo.findAll();
    }

    @PostMapping("/state")
    public StateEntity stateDataPost(@RequestBody StateEntity stateEntity){
        return stateRepo.save(stateEntity);
    }
    @PostMapping("/city")
    public CityEntity cityDataPost(@RequestBody CityEntity cityEntity){
        return cityRepo.save(cityEntity);
    }



}
