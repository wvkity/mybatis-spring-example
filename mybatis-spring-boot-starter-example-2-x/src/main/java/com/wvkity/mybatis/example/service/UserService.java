package com.wvkity.mybatis.example.service;

import com.wvkity.mybatis.example.entity.Exam;
import com.wvkity.mybatis.example.entity.Grade;
import com.wvkity.mybatis.example.entity.Klass;
import com.wvkity.mybatis.example.entity.Relevance;
import com.wvkity.mybatis.example.entity.Student;
import com.wvkity.mybatis.example.entity.Subject;
import com.wvkity.mybatis.example.entity.Teacher;
import com.wvkity.mybatis.example.entity.User;
import com.wvkity.mybatis.service.SimpleService;

import java.util.List;

public interface UserService extends SimpleService<User> {

    int testSave(Grade grade, List<User> users);
    
    int save(List<Grade> grades, List<Klass> klasses, List<Subject> subjects, List<Teacher> teachers,
             List<Relevance> relevances, List<Student> students, List<Exam> exams);
}
