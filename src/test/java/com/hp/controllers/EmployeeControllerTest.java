package com.hp.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;

public class EmployeeControllerTest {
    @Test
    void getAllEmployeesTest() {
        EmployeeManager mockEmployeeManager = mock(EmployeeManager.class);
        EmployeeController employeeController = new EmployeeController(mockEmployeeManager);

        Employees mockEmployees = new Employees();
        when(mockEmployeeManager.getAllEmployees()).thenReturn(mockEmployees);

        Employees result = employeeController.getEmployees();

        assertEquals(mockEmployees, result);
    }

    @Test
    void addEmployeeTest() {
        EmployeeManager mockEmployeeManager = mock(EmployeeManager.class);
        EmployeeController employeeController = new EmployeeController(mockEmployeeManager);

        Employee employee = new Employee("1", "John", "Doe", "john.doe@example.com", "Developer");

        ResponseEntity<Object> result;
            result = employeeController.addEmployee(employee);
            verify(mockEmployeeManager).addEmployee(employee);
            assertEquals("Employee added successfully!", result);
    }
}
