package com.example.entry;

import lombok.Data;

/**
 * @ClassName Student
 * @Description TODO
 * @Author lingxiangxiang
 * @Date 5:14 PM
 * @Version 1.0
 **/
@Data
public class Student {
    private int id;
    private String name;
    private int age;
    private double score;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}
