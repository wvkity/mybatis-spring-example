package com.wvkity.mybatis.example.mapper;

import com.wvkity.mybatis.mapper.SimpleMapper;
import com.wvkity.mybatis.example.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper extends SimpleMapper<User> {
}
