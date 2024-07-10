package com.hp.controllers;

import java.util.ArrayList;
import java.util.List;

public class Employees {
    private List<Employee> employeeList;

    public List<Employee> getemployeeList(){
        if(employeeList == null){
            employeeList = new ArrayList<>();
        }

        return employeeList;
    }

    public void setEmpoyeeList(List<Employee> employeeList){
        this.employeeList = employeeList;
    }
}
