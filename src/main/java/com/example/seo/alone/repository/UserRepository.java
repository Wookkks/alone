package com.example.seo.alone.repository;

import com.example.seo.alone.dto.User;
import com.example.seo.alone.mybatis.UserMapper;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Slf4j
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

    @Override
    public int idCheck(String username) {
        return userMapper.idCheck(username);
    }

    @Override
    public int loginCheck(User user) {
        return userMapper.loginCheck(user);
    }

    @Override
    public void logout(HttpSession session) {
        session.invalidate();
    }

}
