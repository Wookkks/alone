package com.example.seo.alone.controller;

import com.example.seo.alone.dto.ResponseDto;
import com.example.seo.alone.dto.User;
import com.example.seo.alone.service.UserService;
import com.example.seo.alone.vo.UserVo;
import jakarta.servlet.http.HttpSession;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@AllArgsConstructor
@Slf4j
public class UserApiController {

    private final UserService userService;

    @PostMapping("/user/api/join")
    public ResponseDto<Integer> join(@RequestBody User user) {
        userService.join(user);
        return new ResponseDto<Integer>(HttpStatus.OK.value(), 1);
    }

    @PostMapping("/user/api/idCheck")
    @ResponseBody
    public int idCheck(@RequestBody String username) {
        int count = 0;
        count = userService.idCheck(username);
        return count;
    }

    @PostMapping("/user/api/login")
    public void loginCheck(@RequestParam String username, @RequestParam String password, HttpSession session) {
    }
}
