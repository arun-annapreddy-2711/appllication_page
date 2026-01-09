package com.example.demo.dto;

import lombok.Data;

@Data
public class UpdatePwdDto {
    private String email;
    private String oldPassword;
    private String newPassword;
    private String conformPassword;
}
