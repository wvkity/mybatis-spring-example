package com.wvkity.mybatis.springboot.starter.example.mapper;

import com.wvkity.mybatis.mapper.SimpleMapper;
import com.wvkity.mybatis.springboot.starter.example.entity.Teacher;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherMapper extends SimpleMapper<Teacher> {
}
