package com.noetic.Assignment.crudApp.crudAppspringboothsql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.noetic.Assignment.crudApp.crudAppspringboothsql.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}