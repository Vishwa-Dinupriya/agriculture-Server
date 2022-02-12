package com.example.agricultureserver.service;

import com.example.agricultureserver.model.Employee;
import com.example.agricultureserver.repository.EmployeeRepository;
import com.example.agricultureserver.service.impl.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService implements EmployeeServiceImpl {

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public void addEmployee(Integer id, String name, Double salary, String homeTown) {
        Employee employee = new Employee();
        employee.setId(id);
        employee.setName(name);
        employee.setSalary(salary);
        employee.setHomeTown(homeTown);
        employeeRepository.save(employee); // same insert query
    }

    @Override
    public void addEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public Iterable<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeById(Integer id) {
        return employeeRepository.findEmployeeById(id);
    }

    @Override
    public Employee deleteEmployee(Integer id) {
         Employee toBeDeletedEmployee = getEmployeeById(id);
         employeeRepository.delete(toBeDeletedEmployee);
         return toBeDeletedEmployee;
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }
}
