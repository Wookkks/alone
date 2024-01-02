package com.example.seo.alone.controller;

import com.example.seo.alone.dto.User;
import com.example.seo.alone.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
@AllArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/")
    public String index(Model model) {
        List<User> userList = userService.findAll();
        System.out.println("size : " + userList.size());
        model.addAttribute("userList", userList);

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
