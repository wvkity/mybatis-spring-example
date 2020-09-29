package com.wvkity.mybatis.example.service.impl;

import com.wvkity.mybatis.example.entity.Relevance;
import com.wvkity.mybatis.example.mapper.RelevanceMapper;
import com.wvkity.mybatis.example.service.RelevanceService;
import com.wvkity.mybatis.service.AbstractSimpleService;
import org.springframework.stereotype.Service;

@Service
public class DefaultRelevanceService extends AbstractSimpleService<RelevanceMapper, Relevance> 
        implements RelevanceService {
}
