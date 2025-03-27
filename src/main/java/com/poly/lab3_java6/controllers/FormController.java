package com.poly.lab3_java6.controllers;

import com.poly.lab3_java6.models.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/form")
public class FormController {
    @GetMapping("/")
    public String form(Model model){
        model.addAttribute("student", new Student());
        return "form";
    }
    @PostMapping("/save")
    public String save(Model model,@Validated @ModelAttribute("student") Student student, Errors errors){
        if(errors.hasErrors()){
            model.addAttribute("student", student);
            model.addAttribute("message","Nhap du thong tin");
            return "form";
        }
        model.addAttribute("student", student);
        return "result";
    }

}
