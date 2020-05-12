package com.wvkity.mybatis.springboot.starter.example.service;

import com.wvkity.mybatis.service.SerialService;
import com.wvkity.mybatis.springboot.starter.example.entity.Subject;
import com.wvkity.mybatis.springboot.starter.example.vo.SubjectVo;

public interface SubjectService extends SerialService<Subject, SubjectVo> {
}
