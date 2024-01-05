package com.example.seo.alone.controller;

import com.example.seo.alone.dto.User;
import com.example.seo.alone.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
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

//    @PostMapping("/api/user/join")
//    public String join(@RequestBody User user) {
//        int result = userService.join(user);
//        System.out.println("join controller 실행됨");
//        if(result == 1) {
//            return "redirect:/";
//        } else {
//            return "/user/login";
//        }
//
//    }
}
