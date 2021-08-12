package com.yjl.dao;

import com.yjl.domain.Student;

import java.util.List;

public interface Studentdao {
    int insertstuednt(Student student);
    List<Student> selectstudent(String name);
}
