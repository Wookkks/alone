package com.example.seo.alone.mybatis;

import com.example.seo.alone.dto.User;
import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Optional;

@Mapper
public interface UserMapper {
    Optional<User> findById(Long id);
    void join(User user);
    List<User> findAll();
    int idCheck(String username);

    int loginCheck(User user);

    void logout(HttpSession session);
}



