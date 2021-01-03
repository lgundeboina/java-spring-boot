package com.example.demoweb.controlloers;

import com.example.demoweb.models.Employee.Employee;
import com.example.demoweb.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1")
public class HelloController {
    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/employee")
    public List<Employee> getEmployees(){
        return (List<Employee>) employeeRepository.findAll();
    }

    @GetMapping("/employee/{id}")
    public Optional<Employee> getEmployee(@PathVariable(value="id") Long id){
        return employeeRepository.findById(id);
    }
    
    @PostMapping("/employee")
    public Employee addEmployee(@RequestBody() Employee employee){
        return employeeRepository.save(employee);
    }
}
