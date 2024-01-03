package com.example.seo.alone.mybatis;

import com.example.seo.alone.dto.User;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Optional;

@Mapper
public interface UserMapper {

    User save(User user);
    Optional<User> findById(Long id);
    void join(User user);
    List<User> findAll();
}



