package com.example.seo.alone.repository;

import com.example.seo.alone.dto.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface UserRepository {
    List<User> findAll();
}
