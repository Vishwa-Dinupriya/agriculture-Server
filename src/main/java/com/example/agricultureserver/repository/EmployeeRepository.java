package com.example.agricultureserver.repository;

import com.example.agricultureserver.model.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

    Employee findEmployeeById(Integer id);

    @Query(value = "SELECT MAX(id)\n" +
            "FROM employee;",nativeQuery = true)
    Integer getMaxid();

}
