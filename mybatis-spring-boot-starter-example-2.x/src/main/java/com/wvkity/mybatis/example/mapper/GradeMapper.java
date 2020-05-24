package com.wvkity.mybatis.example.mapper;

import com.wvkity.mybatis.mapper.BaseMapper;
import com.wvkity.mybatis.example.entity.Grade;
import com.wvkity.mybatis.example.vo.GradeVo;
import org.springframework.stereotype.Repository;

@Repository
public interface GradeMapper extends BaseMapper<Grade, GradeVo, Long> {
}
