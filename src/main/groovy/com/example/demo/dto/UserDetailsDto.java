package com.example.demo.dto;

import lombok.Data;

@Data
public class UserDetailsDto {
    private Integer student_id;
    private String email;
    private String pwd;
    private String isUpdated;
}
