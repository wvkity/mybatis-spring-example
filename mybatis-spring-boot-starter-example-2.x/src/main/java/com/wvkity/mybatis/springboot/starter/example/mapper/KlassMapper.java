package com.wvkity.mybatis.springboot.starter.example.mapper;

import com.wvkity.mybatis.mapper.SimpleMapper;
import com.wvkity.mybatis.springboot.starter.example.entity.Klass;
import org.springframework.stereotype.Repository;

@Repository
public interface KlassMapper extends SimpleMapper<Klass> {
}
