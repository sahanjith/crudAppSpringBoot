package com.noetic.Assignment.crudApp.crudAppspringboothsql.controller;

import com.noetic.Assignment.crudApp.crudAppspringboothsql.model.Employee;
import com.noetic.Assignment.crudApp.crudAppspringboothsql.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController{
    
    @Autowired
    EmployeeService employeeService;

    @RequestMapping(value="/")
    public String employeeList(Model model) {
        model.addAttribute("employeeList", employeeService.findAll());
        return "employeeList";
    }

    @RequestMapping(value={"/employeeEdit","/employeeEdit/{id}"}, method = RequestMethod.GET)
    public String employeeEditForm(Model model, @PathVariable(required = false, name = "id") Long id) {
        if (null != id) {
            model.addAttribute("employee", employeeService.findOne(id));
        } else {
            model.addAttribute("employee", new Employee());
        }
        return "employeeEdit";
    }

    @RequestMapping(value="/employeeEdit", method = RequestMethod.POST)
    public String employeeEdit(Model model, Employee employee) {
        employeeService.saveEmployee(employee);
        model.addAttribute("employeeList", employeeService.findAll());
        return "employeeList";
    }

    @RequestMapping(value="/employeeDelete/{id}", method = RequestMethod.GET)
    public String employeeDelete(Model model, @PathVariable(required = true, name = "id") Long id) {
        employeeService.deleteEmployee(id);
        model.addAttribute("employeeList", employeeService.findAll());
        return "employeeList";
    }

}