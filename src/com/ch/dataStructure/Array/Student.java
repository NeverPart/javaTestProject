package com.ch.dataStructure.Array;

/**
 * @className: Student
 * @Auther: ch
 * @Date: 2021/5/22 13:48
 * @Description: TODO
 */
public class Student {
    private String name;
    private int age;
    public Student(){

    }
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        MyArray<Student> studentMyArray = new MyArray<>();
        studentMyArray.addLast(new Student("张三",13));
        studentMyArray.addLast(new Student("李四",14));
        studentMyArray.addLast(new Student("王五",15));
        System.out.println(studentMyArray);
    }
}
