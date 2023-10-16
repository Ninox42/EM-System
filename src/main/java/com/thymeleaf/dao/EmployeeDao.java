package com.thymeleaf.dao;

import com.thymeleaf.entity.Employee;

import java.util.List;

public interface EmployeeDao {
    List<Employee>lists();

    void save(Employee employee);
}