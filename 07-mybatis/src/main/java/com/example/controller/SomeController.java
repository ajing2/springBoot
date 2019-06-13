package com.example.controller;

import com.example.common.ResultBean;
import com.example.entry.Student;
import com.example.service.SomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName SomeController
 * @Description TODO
 * @Author lingxiangxiang
 * @Date 5:12 PM
 * @Version 1.0
 **/
@RestController
@RequestMapping("/some")
public class SomeController {

    @Autowired
    private SomeService someService;

    @RequestMapping("/add")
    public @ResponseBody
    ResultBean<Object> addStudent(Student student) {
        someService.addStudent(student);
        return ResultBean.result(200, "success", null);
    }

    @RequestMapping("/query")
    public @ResponseBody ResultBean<Object> queryStudent(Student student) {
        List<Student> data = someService.queryStudent(student);
        return ResultBean.result(200, "success", data);

    }


}
