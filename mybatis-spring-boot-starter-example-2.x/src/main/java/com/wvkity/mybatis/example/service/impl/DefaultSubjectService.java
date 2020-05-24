package com.wvkity.mybatis.example.service.impl;

import com.wvkity.mybatis.example.entity.Subject;
import com.wvkity.mybatis.example.mapper.SubjectMapper;
import com.wvkity.mybatis.example.service.SubjectService;
import com.wvkity.mybatis.example.vo.SubjectVo;
import com.wvkity.mybatis.service.AbstractSerialService;
import org.springframework.stereotype.Repository;

@Repository
public class DefaultSubjectService extends AbstractSerialService<SubjectMapper, Subject, SubjectVo> implements SubjectService {
}
