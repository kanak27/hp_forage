package com.hp.controllers;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeManager {
    private static Employees list = new Employees();

    static{
        list.getemployeeList().add(
            new Employee(
                "1",
                "Dinesh",
                "Lohiya",
                "lohiyabesroli@gmail.com",
                "Head"
            )
        );

        list.getemployeeList().add(
            new Employee(
                "2",
                "Ashish",
                "Singh",
                "lohiyamakrana@gmail.com",
                "Manager"
            )
        );

        list.getemployeeList().add(
            new Employee(
                "3",
                "Mukesh",
                "Goswami",
                "mukeshg@gmail.com",
                "Salesman"
            )
        );

        list.getemployeeList().add(
            new Employee(
                "4",
                "Kanak",
                "Lohiya",
                "kanaklohiya.lohiya@gmail.com",
                "intern"
            )
        );
    }

    public Employees getAllEmployees(){
        return list;
    }

    public void addEmployee(Employee employee){
        list.getemployeeList().add(employee);
    }
}
