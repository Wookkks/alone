package com.example.seo.alone.config;

import com.example.seo.alone.mybatis.UserMapper;
import com.example.seo.alone.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
@RequiredArgsConstructor
public class MyBatisConfig {

    private final UserMapper userMapper;
    @Bean
    public UserRepository userRepository() {
      log.info("MybatisUserRepository Config");
      return new UserRepository(userMapper);
    }
}
