package com.wvkity.mybatis.springboot.starter.example.service.impl;

import com.wvkity.mybatis.service.AbstractUniformService;
import com.wvkity.mybatis.springboot.starter.example.entity.Exam;
import com.wvkity.mybatis.springboot.starter.example.mapper.ExamMapper;
import com.wvkity.mybatis.springboot.starter.example.service.ExamService;
import org.springframework.stereotype.Service;

@Service
public class DefaultExamService extends AbstractUniformService<ExamMapper, Exam, Long>
        implements ExamService {
}
