package com.ch.testProject;

import java.util.stream.Stream;

/**
 * @className: Student
 * @Auther: ch
 * @Date: 2021/6/3 10:45
 * @Description: TODO
 */
public class Student extends Clazz{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
