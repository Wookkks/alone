package com.example.seo.alone.service;

import com.example.seo.alone.dto.User;
import com.example.seo.alone.mybatis.UserMapper;
import com.example.seo.alone.util.SHA_256;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserMapper userMapper;
    private final SHA_256 sha256;

    public void join(User user) {
        userMapper.join(user);
    }


    public List<User> findAll() {
        return userMapper.findAll();
    }

}
