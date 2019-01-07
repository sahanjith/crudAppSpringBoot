package com.noetic.Assignment.crudApp.crudAppspringboothsql.service;

import java.util.List;

import com.noetic.Assignment.crudApp.crudAppspringboothsql.model.Employee;
import com.noetic.Assignment.crudApp.crudAppspringboothsql.repository.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository; 

    @Override
    public List<Employee> findAll(){
        return employeeRepository.findAll();
    }

    @Override
    public Employee findOne(Long id) {
        Employee employee = employeeRepository.findById(id).orElse(new Employee());
        return employee;
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }



}