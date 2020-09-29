package com.wvkity.mybatis.example.mapper;

import com.wvkity.mybatis.mapper.SerialMapper;
import com.wvkity.mybatis.example.entity.Student;
import com.wvkity.mybatis.example.vo.StudentVo;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentMapper extends SerialMapper<Student, StudentVo> {
}
