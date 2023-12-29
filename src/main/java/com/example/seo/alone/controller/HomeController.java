package com.example.seo.alone.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/user/join")
    public String join() {
        return "user/join";
    }

    @GetMapping("/user/login")
    public String login() {
        return "user/login";
    }
}
