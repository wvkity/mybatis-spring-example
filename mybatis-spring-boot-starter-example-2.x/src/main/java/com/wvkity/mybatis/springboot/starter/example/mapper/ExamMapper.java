package com.wvkity.mybatis.springboot.starter.example.mapper;

import com.wvkity.mybatis.mapper.UniformMapper;
import com.wvkity.mybatis.springboot.starter.example.entity.Exam;
import org.springframework.stereotype.Repository;

@Repository
public interface ExamMapper extends UniformMapper<Exam, Long> {
}
