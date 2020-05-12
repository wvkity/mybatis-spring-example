package com.wvkity.mybatis.springboot.starter.example.mapper;

import com.wvkity.mybatis.mapper.BaseMapper;
import com.wvkity.mybatis.springboot.starter.example.entity.Grade;
import com.wvkity.mybatis.springboot.starter.example.vo.GradeVo;
import org.springframework.stereotype.Repository;

@Repository
public interface GradeMapper extends BaseMapper<Grade, GradeVo, Long> {
}
