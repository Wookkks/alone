package com.example.seo.alone.service;

import com.example.seo.alone.dto.User;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {

    public List<User> findAll();

}
