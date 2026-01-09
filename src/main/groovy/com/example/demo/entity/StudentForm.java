package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Data
public class StudentForm {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int student_id;

    private String name;
    private String email;
    private String password;
    private String isUpdPassword;

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


    public CountryEntity getCountry() {
        return country;
    }

    public void setCountry(CountryEntity country) {
        this.country = country;
    }

    public StateEntity getState() {
        return state;
    }

    public void setState(StateEntity state) {
        this.state = state;
    }

    public CityEntity getCity() {
        return city;
    }

    public void setCity(CityEntity city) {
        this.city = city;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdatedTime() {
        return UpdatedTime;
    }

    public void setUpdatedTime(String updatedTime) {
        UpdatedTime = updatedTime;
    }



}
