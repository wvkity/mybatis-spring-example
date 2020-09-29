package com.wvkity.mybatis.example.service;

import com.wvkity.mybatis.example.entity.Student;
import com.wvkity.mybatis.service.SerialService;
import com.wvkity.mybatis.example.vo.StudentVo;

public interface StudentService extends SerialService<Student, StudentVo> {
}
