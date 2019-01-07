package com.noetic.Assignment.crudApp.crudAppspringboothsql.service;

import java.util.List;

import com.noetic.Assignment.crudApp.crudAppspringboothsql.model.Employee;

public interface EmployeeService {
    List<Employee> findAll();

    Employee findOne(Long id);

    Employee saveEmployee(Employee employee);

    void deleteEmployee(Long id);

}