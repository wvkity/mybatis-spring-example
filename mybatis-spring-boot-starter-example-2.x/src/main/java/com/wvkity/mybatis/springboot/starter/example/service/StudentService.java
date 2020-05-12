package com.wvkity.mybatis.springboot.starter.example.service;

import com.wvkity.mybatis.service.SerialService;
import com.wvkity.mybatis.springboot.starter.example.entity.Student;
import com.wvkity.mybatis.springboot.starter.example.vo.StudentVo;

public interface StudentService extends SerialService<Student, StudentVo> {
}
