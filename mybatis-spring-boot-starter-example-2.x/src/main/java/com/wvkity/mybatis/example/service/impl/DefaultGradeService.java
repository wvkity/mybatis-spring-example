package com.wvkity.mybatis.example.service.impl;

import com.wvkity.mybatis.example.entity.Grade;
import com.wvkity.mybatis.example.mapper.GradeMapper;
import com.wvkity.mybatis.example.service.GradeService;
import com.wvkity.mybatis.service.AbstractBaseService;
import com.wvkity.mybatis.example.vo.GradeVo;
import org.springframework.stereotype.Service;

@Service
public class DefaultGradeService extends AbstractBaseService<GradeMapper, Grade, GradeVo, Long> 
        implements GradeService {

}
