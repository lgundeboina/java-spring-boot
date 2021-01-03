package com.example.demoweb.repositories;

import com.example.demoweb.models.Employee.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
    Employee findById(long id);
}
