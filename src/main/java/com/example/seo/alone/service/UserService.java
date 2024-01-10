package com.example.seo.alone.service;

import com.example.seo.alone.dto.User;
import com.example.seo.alone.mybatis.UserMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserService {

    private final UserMapper userMapper;

    public void join(User user) {
        userMapper.join(user);
    }
    public List<User> findAll() {
        return userMapper.findAll();
    }
    public int idCheck(String username) {
        return userMapper.idCheck(username);
    }
    public int loginCheck(User user) {
        return userMapper.loginCheck(user);
    }

}
