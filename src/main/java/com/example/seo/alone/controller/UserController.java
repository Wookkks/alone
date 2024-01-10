package com.example.seo.alone.controller;

import com.example.seo.alone.dto.User;
import com.example.seo.alone.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
@Slf4j
public class UserController {

    private final UserService userService;

    @GetMapping({"", "/"})
    public String index(Model model) {
        List<User> users = userService.findAll();
        model.addAttribute("users", users);
        return "index";
    }

    @GetMapping("/user/join")
    public String joinForm() {
        return "user/join";
    }

    @PostMapping("/user/join")
    public String join(User user) {
        userService.join(user);
        return "redirect:/";
    }

    @GetMapping("/user/login")
    public String login() {
        return "user/login";
    }

}
