package com.noetic.Assignment.crudApp.crudAppspringboothsql.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import com.noetic.Assignment.crudApp.crudAppspringboothsql.model.Employee;

/* THIS CLASS IS IMPLEMENTED TO INITIALIZE SOME DATA WHEN THE SERVER STARTS */

@Service
public class InitApplicationService {
    private static final Logger LOGGER = LoggerFactory.getLogger(InitApplicationService.class);

    @Autowired
    EmployeeService employeeService;

    @EventListener(ApplicationReadyEvent.class)
    public void initializeTestData() {
        LOGGER.info("Initialize test data");

        employeeService.saveEmployee(new Employee("Sahan", "Weerakkody"));
        employeeService.saveEmployee(new Employee("Kamal", "Perera"));

        LOGGER.info("Initialization completed");
    }
}