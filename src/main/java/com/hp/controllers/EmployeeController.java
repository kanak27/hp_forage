package com.hp.controllers;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping(path = "/employees")
public class EmployeeController {

    @Autowired
    private EmployeeManager employeeManager;

    public EmployeeController(EmployeeManager employeeManager){
        this.employeeManager = employeeManager;
    }

    @GetMapping(path = "/", produces = "application/json")
    public Employees getEmployees(){
        return employeeManager.getAllEmployees();
    }

    @PostMapping(path = "/", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Object> addEmployee(@RequestBody Employee employee) {
        Integer Id = employeeManager.getAllEmployees().getemployeeList().size() + 1;
        employee.setid(Integer.toString(Id));
        employeeManager.addEmployee(employee);
        URI location = ServletUriComponentsBuilder
                    .fromCurrentRequest()
                    .path("/{id}")
                    .buildAndExpand(employee.getId())
                    .toUri();
        
        return ResponseEntity.created(location).build();
    }
    
}
