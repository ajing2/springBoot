package com.example.service;

import com.example.entry.Student;

import java.util.List;

/**
 * @ClassName SomeService
 * @Description TODO
 * @Author lingxiangxiang
 * @Date 5:13 PM
 * @Version 1.0
 **/
public interface SomeService {
    public void addStudent(Student student);
    public List<Student> queryStudent(Student student);
}
