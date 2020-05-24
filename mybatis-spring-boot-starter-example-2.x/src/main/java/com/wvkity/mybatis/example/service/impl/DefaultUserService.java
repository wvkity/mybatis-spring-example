package com.wvkity.mybatis.example.service.impl;

import com.wvkity.mybatis.example.entity.Teacher;
import com.wvkity.mybatis.example.mapper.UserMapper;
import com.wvkity.mybatis.service.AbstractSimpleService;
import com.wvkity.mybatis.example.entity.Exam;
import com.wvkity.mybatis.example.entity.Grade;
import com.wvkity.mybatis.example.entity.Klass;
import com.wvkity.mybatis.example.entity.Relevance;
import com.wvkity.mybatis.example.entity.Student;
import com.wvkity.mybatis.example.entity.Subject;
import com.wvkity.mybatis.example.entity.User;
import com.wvkity.mybatis.example.service.ExamService;
import com.wvkity.mybatis.example.service.GradeService;
import com.wvkity.mybatis.example.service.KlassService;
import com.wvkity.mybatis.example.service.RelevanceService;
import com.wvkity.mybatis.example.service.StudentService;
import com.wvkity.mybatis.example.service.SubjectService;
import com.wvkity.mybatis.example.service.TeacherService;
import com.wvkity.mybatis.example.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class DefaultUserService extends AbstractSimpleService<UserMapper, User> implements UserService {

    private final GradeService gradeService;
    private final SubjectService subjectService;
    private final KlassService klassService;
    private final TeacherService teacherService;
    private final StudentService studentService;
    private final ExamService examService;
    private final RelevanceService relevanceService;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public int testSave(Grade grade, List<User> users) {
        gradeService.save(grade);
        return embeddedBatchSave(users);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public int save(List<Grade> grades, List<Klass> klasses, List<Subject> subjects, List<Teacher> teachers,
                    List<Relevance> relevances, List<Student> students, List<Exam> exams) {
        int result = 0;
        result += gradeService.batchSaveNotWithAudit(grades);
        result += subjectService.batchSaveNotWithAudit(subjects);
        result += klassService.batchSaveNotWithAudit(klasses);
        result += teacherService.batchSaveNotWithAudit(teachers);
        result += relevanceService.batchSaveNotWithAudit(relevances);
        result += studentService.batchSaveNotWithAudit(students);
        result += examService.batchSaveNotWithAudit(exams);
        return result;
    }
}
