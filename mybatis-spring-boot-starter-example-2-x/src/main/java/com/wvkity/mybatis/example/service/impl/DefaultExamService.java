package com.wvkity.mybatis.example.service.impl;

import com.wvkity.mybatis.example.entity.Exam;
import com.wvkity.mybatis.example.mapper.ExamMapper;
import com.wvkity.mybatis.example.service.ExamService;
import com.wvkity.mybatis.service.AbstractUniformService;
import org.springframework.stereotype.Service;

@Service
public class DefaultExamService extends AbstractUniformService<ExamMapper, Exam, Long>
        implements ExamService {
}
