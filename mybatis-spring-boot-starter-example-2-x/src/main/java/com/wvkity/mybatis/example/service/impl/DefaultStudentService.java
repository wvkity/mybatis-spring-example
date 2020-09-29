package com.wvkity.mybatis.example.service.impl;

import com.wvkity.mybatis.example.entity.Student;
import com.wvkity.mybatis.example.mapper.StudentMapper;
import com.wvkity.mybatis.example.service.StudentService;
import com.wvkity.mybatis.service.AbstractSerialService;
import com.wvkity.mybatis.example.vo.StudentVo;
import org.springframework.stereotype.Service;

@Service
public class DefaultStudentService extends AbstractSerialService<StudentMapper, Student, StudentVo> implements StudentService {
}
