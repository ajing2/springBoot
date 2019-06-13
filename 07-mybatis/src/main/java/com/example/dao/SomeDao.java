package com.example.dao;

import com.example.entry.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SomeDao {
    public void addStudent(Student student);

    public List<Student> queryStudent(Student student);
}
