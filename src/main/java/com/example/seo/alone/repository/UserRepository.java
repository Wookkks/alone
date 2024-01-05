package com.example.seo.alone.repository;

import com.example.seo.alone.dto.User;
import com.example.seo.alone.mybatis.UserMapper;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
public class UserRepository implements UserMapper {

    private final UserMapper userMapper;

    @Override
    public Optional<User> findById(Long id) {
        return userMapper.findById(id);
    }

    @Override
    public void join(User user) {
        userMapper.join(user);
    }

    @Override
    public List<User> findAll() {
        return  userMapper.findAll();
    }
}
