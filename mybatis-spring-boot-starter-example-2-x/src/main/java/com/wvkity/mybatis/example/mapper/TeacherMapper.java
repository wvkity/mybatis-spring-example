package com.wvkity.mybatis.example.mapper;

import com.wvkity.mybatis.mapper.SimpleMapper;
import com.wvkity.mybatis.example.entity.Teacher;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherMapper extends SimpleMapper<Teacher> {
}
