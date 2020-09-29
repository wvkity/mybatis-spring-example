package com.wvkity.mybatis.example.service.impl;

import com.wvkity.mybatis.example.entity.Teacher;
import com.wvkity.mybatis.example.mapper.TeacherMapper;
import com.wvkity.mybatis.example.service.TeacherService;
import com.wvkity.mybatis.service.AbstractSimpleService;
import org.springframework.stereotype.Service;

@Service
public class DefaultTeacherService extends AbstractSimpleService<TeacherMapper, Teacher> implements TeacherService {
}
