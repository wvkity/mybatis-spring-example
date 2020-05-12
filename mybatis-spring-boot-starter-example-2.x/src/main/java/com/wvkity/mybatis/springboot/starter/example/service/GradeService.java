package com.wvkity.mybatis.springboot.starter.example.service;

import com.wvkity.mybatis.service.BaseService;
import com.wvkity.mybatis.springboot.starter.example.entity.Grade;
import com.wvkity.mybatis.springboot.starter.example.vo.GradeVo;

public interface GradeService extends BaseService<Grade, GradeVo, Long> {
}
