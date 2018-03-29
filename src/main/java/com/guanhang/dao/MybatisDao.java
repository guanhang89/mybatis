package com.guanhang.dao;

import com.guanhang.bean.Student;
import com.guanhang.bean.StudentExample;
import com.guanhang.mapper.StudentMapper;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class MybatisDao {

//    @Autowired
    public StudentMapper mapper;

    public void quey(StudentExample student) {
        List<Student> students = mapper.selectByExample(student);
        System.out.println(students.toString());

    }

    public StudentMapper getMapper() {
        return mapper;
    }

    public void setMapper(StudentMapper mapper) {
        this.mapper = mapper;
    }
}
