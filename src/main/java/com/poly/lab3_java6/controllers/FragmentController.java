package com.poly.lab3_java6.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FragmentController {
    @GetMapping("/")
    public String fragment(){
        return "home/index";
    }
    @GetMapping("/about")
    public String fragment1(){
        return "home/about";
    }
}
