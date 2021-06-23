package com.ch.java8Character.Lambda;

import com.ch.java8Character.entity.Employee;

/**
 * @className: FilterEmpBySalary
 * @Auther: ch
 * @Date: 2021/5/24 11:49
 * @Description: 通过工资过滤员工
 */
public class FilterEmpBySalary implements MyPredicate<Employee> {
    @Override
    public boolean filter(Employee employee) {
        return employee.getSalary()>5000;
    }
}
