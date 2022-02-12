package com.example.agricultureserver.service.impl;

import com.example.agricultureserver.model.Employee;

public interface EmployeeServiceImpl {

    void addEmployee(Integer id, String name, Double salary, String homeTown);

    void addEmployee( Employee employee);

    Iterable<Employee> getAllEmployees();

    Employee getEmployeeById(Integer id);

    Employee deleteEmployee(Integer id);

    Employee updateEmployee(Employee employee);
}
