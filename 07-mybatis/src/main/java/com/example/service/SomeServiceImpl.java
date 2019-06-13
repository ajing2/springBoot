package com.example.service;

import com.example.entry.Student;
import com.example.dao.SomeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName SomeServiceImpl
 * @Description TODO
 * @Author lingxiangxiang
 * @Date 5:30 PM
 * @Version 1.0
 **/
@Service("someService")
public class SomeServiceImpl implements SomeService{

    @Resource
    private SomeDao someDao;

    @Override
    public void addStudent(Student student) {
        someDao.addStudent(student);
    }

    @Override
    public List<Student> queryStudent(Student student) {
        return someDao.queryStudent(student);
    }

}
