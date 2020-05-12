package com.wvkity.mybatis.springboot.starter.example.service.impl;

import com.wvkity.mybatis.service.AbstractBaseService;
import com.wvkity.mybatis.springboot.starter.example.entity.Grade;
import com.wvkity.mybatis.springboot.starter.example.mapper.GradeMapper;
import com.wvkity.mybatis.springboot.starter.example.service.GradeService;
import com.wvkity.mybatis.springboot.starter.example.vo.GradeVo;
import org.springframework.stereotype.Service;

@Service
public class DefaultGradeService extends AbstractBaseService<GradeMapper, Grade, GradeVo, Long> 
        implements GradeService {

}
