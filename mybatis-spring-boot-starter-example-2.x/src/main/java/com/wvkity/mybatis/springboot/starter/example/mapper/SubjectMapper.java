package com.wvkity.mybatis.springboot.starter.example.mapper;

import com.wvkity.mybatis.mapper.SerialMapper;
import com.wvkity.mybatis.springboot.starter.example.entity.Subject;
import com.wvkity.mybatis.springboot.starter.example.vo.SubjectVo;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectMapper extends SerialMapper<Subject, SubjectVo> {
}
