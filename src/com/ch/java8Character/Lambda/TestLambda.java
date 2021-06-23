package com.ch.java8Character.Lambda;

import com.ch.java8Character.entity.Employee;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @className: TestLambda
 * @Auther: ch
 * @Date: 2021/5/24 10:53
 * @Description: TODO
 */
public class TestLambda {
    @Test
    public void test1() {
        Comparator<Integer> com = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                System.out.println(o1.compareTo(o2));
                System.out.println(Integer.compare(o1, o2));
                return Integer.compare(o1, o2);
            }
        };
        com.compare(3, 1);
    }

    // Lambda表达式
    @Test
    public void test2() {
        Comparator<Integer> com = (x, y) -> Integer.compare(x, y);
        System.out.println(com.compare(2, 1));
    }

    List<Employee> employees = Arrays.asList(
            new Employee("张三", 13, 3333.33),
            new Employee("李四", 14, 4444.33),
            new Employee("王五", 25, 5555.33),
            new Employee("赵六", 26, 6666.66),
            new Employee("周七", 27, 6666.66)

    );

    //需求:获取员工中年龄大于25的员工信息
    public List<Employee> filterEmpByAge(List<Employee> list) {
        List<Employee> res = new ArrayList<>();
        for (Employee employee : list) {
            if (employee.getAge() > 25) {
                res.add(employee);
            }
        }
        return res;
    }

    @Test
    public void test3() {
        List<Employee> employees = filterEmpByAge(this.employees);
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    // 需求: 获取员工中工资大于5000的员工信息
    public List<Employee> filterEmpBySalary(List<Employee> list) {
        List<Employee> res = new ArrayList<>();
        for (Employee employee : list) {
            if (employee.getSalary() > 5000) {
                res.add(employee);
            }
        }
        return res;
    }

    @Test
    public void test4() {
        List<Employee> employees = filterEmpBySalary(this.employees);
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    // 优化方式一:策略设计模式
    public List<Employee> filterEmployee(List<Employee> list, MyPredicate<Employee> myPredicate) {
        List<Employee> emps = new ArrayList<>();
        for (Employee emp : list) {
            if (myPredicate.filter(emp)) {
                emps.add(emp);
            }
        }
        return emps;
    }

    @Test
    public void test5() {
        System.out.println("==========通过年龄过滤==========");
        List<Employee> employees = filterEmployee(this.employees, new FilterEmpByAge());
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        System.out.println("==========通过工资过滤==========");
        List<Employee> employees2 = filterEmployee(this.employees, new FilterEmpBySalary());
        for (Employee employee : employees2) {
            System.out.println(employee);
        }
    }

    // 优化方式2:策略模式使用 匿名内部类
    @Test
    public void test6() {
        List<Employee> employees = filterEmployee(this.employees, new MyPredicate<Employee>() {
            @Override
            public boolean filter(Employee employee) {
                return employee.getAge() > 25;
            }
        });
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
    // 优化方式3 : Lambda表达式
    @Test
    public void test7(){
        List<Employee> employees = filterEmployee(this.employees, (e) -> e.getAge() > 25);
        employees.forEach(System.out::println);
    }

    // 优化方式4 : Stream API
    @Test
    public void test(){
        this.employees.stream()
                .filter((e)->e.getSalary()>5000)
                .forEach(System.out::println);
    }
}
