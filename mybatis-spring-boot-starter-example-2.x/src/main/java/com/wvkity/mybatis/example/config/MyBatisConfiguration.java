package com.wvkity.mybatis.example.config;

import com.wvkity.mybatis.core.data.auditing.AuditorAware;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.wvkity.mybatis.springboot.starter.example.mapper")
public class MyBatisConfiguration {
    
    @Bean
    public AuditorAware auditorAware() {
        return new DefaultAuditorAware();
    }
}
