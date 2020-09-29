package com.wvkity.mybatis.example.config;

import com.wvkity.mybatis.core.data.auditing.AuditorAware;

public class DefaultAuditorAware implements AuditorAware {
    
    @Override
    public Object currentUserName() {
        return "administrator";
    }

    @Override
    public Object currentUserId() {
        return 2L;
    }
}
