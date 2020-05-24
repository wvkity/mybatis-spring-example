package com.wvkity.mybatis.example.service.impl;

import com.wvkity.mybatis.example.entity.Klass;
import com.wvkity.mybatis.example.mapper.KlassMapper;
import com.wvkity.mybatis.example.service.KlassService;
import com.wvkity.mybatis.service.AbstractSimpleService;
import org.springframework.stereotype.Service;

@Service
public class DefaultKlassService extends AbstractSimpleService<KlassMapper, Klass> implements KlassService {
}
