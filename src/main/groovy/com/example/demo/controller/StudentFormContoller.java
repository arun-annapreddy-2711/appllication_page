package com.example.demo.controller;


import com.example.demo.entity.StudentForm;
import com.example.demo.reposistory.EntityReposistory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class StudentFormContoller {
    private EntityReposistory entityReposistory;
    public StudentFormContoller(EntityReposistory entityReposistory){
        this.entityReposistory=entityReposistory;
    }

    @GetMapping
    public String studentPage(Model model){

        StudentForm stuForm=new StudentForm();
        model.addAttribute("student",stuForm);
        return "student_page";
    }
    @PostMapping("/studentRegistration")
    public String studentRegistrationForm(StudentForm student){
        entityReposistory.save(student);
        return "redirect:/";

    }
}
