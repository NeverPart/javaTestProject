package com.ch.java8Character.Lambda;

import com.ch.java8Character.entity.Employee;

/**
 * @className: FilterEmpByAge
 * @Auther: ch
 * @Date: 2021/5/24 11:42
 * @Description: TODO
 */
public class FilterEmpByAge implements MyPredicate<Employee> {

    @Override
    public boolean filter(Employee employee) {
        return employee.getAge()>25;
    }
}
