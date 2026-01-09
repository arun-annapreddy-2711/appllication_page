package com.example.demo.dto;


import lombok.Data;

@Data

public class RegisterFormDto {


    private int student_id;

    private String name;
    private String email;
    private String password;

    private String isUpdPassword;
    private long number;
    private Integer country_id;
    private Integer state_id;
    private Integer city_id;


    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIsUpdPassword() {
        return isUpdPassword;
    }

    public void setIsUpdPassword(String isUpdPassword) {
        this.isUpdPassword = isUpdPassword;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public Integer getCountry_id() {
        return country_id;
    }

    public void setCountry_id(Integer country_id) {
        this.country_id = country_id;
    }

    public Integer getState_id() {
        return state_id;
    }

    public void setState_id(Integer state_id) {
        this.state_id = state_id;
    }

    public Integer getCity_id() {
        return city_id;
    }

    public void setCity_id(Integer city_id) {
        this.city_id = city_id;
    }

}
