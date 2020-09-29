package com.wvkity.mybatis.example.junit.query;

import com.alibaba.fastjson.JSON;
import com.wvkity.mybatis.core.wrapper.criteria.SimpleCriteria;
import com.wvkity.mybatis.example.entity.Student;
import com.wvkity.mybatis.example.service.StudentService;
import com.wvkity.mybatis.example.vo.StudentVo;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.inject.Inject;
import java.util.List;

@SpringBootTest
@ExtendWith(SpringExtension.class)
@Log4j2
public class SimpleQueryApplication {
    
    @Inject
    private StudentService studentService;
    
    @Test
    public void idEqTest() {
        SimpleCriteria<Student> criteria = SimpleCriteria.from(Student.class);
        criteria.idEq(1L);
        List<StudentVo> list = studentService.list(criteria);
        log.info("执行结果: {}", JSON.toJSONString(list));
    }

    @Test
    public void orIdEqTest() {
        SimpleCriteria<Student> criteria = SimpleCriteria.from(Student.class);
        criteria.idEq(1L).orIdEq(5L);
        List<StudentVo> list = studentService.list(criteria);
        log.info("执行结果: {}", JSON.toJSONString(list));
    }
    
    @Test
    public void eqTest() {
        SimpleCriteria<Student> criteria = SimpleCriteria.from(Student.class);
        criteria.eq(Student::getEmail, "881889507@qq.com").orEq("email", "4151807988@qq.com").orEqWith("NAME", "梁康星");
        List<StudentVo> list = studentService.list(criteria);
        log.info("执行结果: {}", JSON.toJSONString(list));
    }
    
    @Test
    public void neTest() {
        SimpleCriteria<Student> criteria = SimpleCriteria.from(Student.class);
        criteria.ne(Student::getKlassId, 5).ne("sex", 1).neWith("PERIOD", 2012);
        List<StudentVo> list = studentService.list(criteria);
        //QueryCriteria.from(Student.class).sumWithAlias()
        log.info("执行结果: {}", JSON.toJSONString(list));
    }
    
    @Test
    public void gtTest() {
        SimpleCriteria<Student> criteria = SimpleCriteria.from(Student.class);
        criteria.gt(Student::getKlassId, 8).gt("id", 400).orGtWith("version", 2);
        List<StudentVo> list = studentService.list(criteria);
        log.info("执行结果: {}", JSON.toJSONString(list));
    }

    @Test
    public void geTest() {
        SimpleCriteria<Student> criteria = SimpleCriteria.from(Student.class);
        criteria.ge(Student::getKlassId, 8).ge("id", 400).orGeWith("version", 2);
        List<StudentVo> list = studentService.list(criteria);
        log.info("执行结果: {}", JSON.toJSONString(list));
    }

    @Test
    public void ltTest() {
        SimpleCriteria<Student> criteria = SimpleCriteria.from(Student.class);
        criteria.lt(Student::getKlassId, 6).lt("id", 20).orLtWith("version", 2);
        List<StudentVo> list = studentService.list(criteria);
        log.info("执行结果: {}", JSON.toJSONString(list));
    }

    @Test
    public void leTest() {
        SimpleCriteria<Student> criteria = SimpleCriteria.from(Student.class);
        criteria.le(Student::getKlassId, 6).le("id", 20).orLeWith("version", 2);
        List<StudentVo> list = studentService.list(criteria);
        log.info("执行结果: {}", JSON.toJSONString(list));
    }
    
    
    @Test
    public void isNullTest() {
        SimpleCriteria<Student> criteria = SimpleCriteria.from(Student.class);
        criteria.isNull(Student::getAddress).orIsNullWith("email");
        List<StudentVo> list = studentService.list(criteria);
        log.info("执行结果: {}", JSON.toJSONString(list));
    }
}
