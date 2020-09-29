package com.wvkity.mybatis.example.mapper;

import com.wvkity.mybatis.mapper.SerialMapper;
import com.wvkity.mybatis.example.entity.Subject;
import com.wvkity.mybatis.example.vo.SubjectVo;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectMapper extends SerialMapper<Subject, SubjectVo> {
}
