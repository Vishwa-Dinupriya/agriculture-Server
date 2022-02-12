package com.example.agricultureserver.controller;

import com.example.agricultureserver.model.Employee;
import com.example.agricultureserver.service.impl.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeServiceImpl employeeServiceImpl;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public void addEmployee(@RequestBody Employee employee) {
        System.out.println(employee);
        employeeServiceImpl.addEmployee(employee);
        System.out.println("New Employee Added!" + employee);
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public Iterable<Employee> getEmployees() {
        return employeeServiceImpl.getAllEmployees();
    }

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public Employee getEmployee(@PathVariable Integer id) {
        return employeeServiceImpl.getEmployeeById(id);
    }

    @RequestMapping(value="/delete", method = RequestMethod.DELETE)
    public Employee deleteEmployee(@RequestParam Integer id){
        return employeeServiceImpl.deleteEmployee(id);
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public Employee updateEmployee(@RequestBody Employee employee) {
        System.out.println(employee);
        employeeServiceImpl.updateEmployee(employee);
        return employee;
    }

}
