package com.wvkity.mybatis.springboot.starter.example.mapper;

import com.wvkity.mybatis.mapper.SerialMapper;
import com.wvkity.mybatis.springboot.starter.example.entity.Student;
import com.wvkity.mybatis.springboot.starter.example.vo.StudentVo;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentMapper extends SerialMapper<Student, StudentVo> {
}
