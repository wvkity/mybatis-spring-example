package com.wvkity.mybatis.example.mapper;

import com.wvkity.mybatis.mapper.UniformMapper;
import com.wvkity.mybatis.example.entity.Exam;
import org.springframework.stereotype.Repository;

@Repository
public interface ExamMapper extends UniformMapper<Exam, Long> {
}
