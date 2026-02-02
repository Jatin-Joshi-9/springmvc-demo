package com.example.springmvcdemo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

    @Controller
    public class HomeController {

        @GetMapping("/")
        public String home() {
            return "home";
        }

        @PostMapping("/submit")
        public String submit(
                @RequestParam String name,
                @RequestParam String email,
                Model model) {

            model.addAttribute("name", name);
            model.addAttribute("email", email);

            return "result";
        }
    }

