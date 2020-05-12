package com.wvkity.mybatis.springboot.starter.example.service.impl;

import com.wvkity.mybatis.service.AbstractSimpleService;
import com.wvkity.mybatis.springboot.starter.example.entity.Relevance;
import com.wvkity.mybatis.springboot.starter.example.mapper.RelevanceMapper;
import com.wvkity.mybatis.springboot.starter.example.service.RelevanceService;
import org.springframework.stereotype.Service;

@Service
public class DefaultRelevanceService extends AbstractSimpleService<RelevanceMapper, Relevance> 
        implements RelevanceService {
}
