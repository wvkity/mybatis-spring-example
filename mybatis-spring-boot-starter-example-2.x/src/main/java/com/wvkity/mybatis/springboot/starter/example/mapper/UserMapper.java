package com.wvkity.mybatis.springboot.starter.example.mapper;

import com.wvkity.mybatis.mapper.SimpleMapper;
import com.wvkity.mybatis.springboot.starter.example.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper extends SimpleMapper<User> {
}
