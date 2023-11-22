package com.proiect.MVC.cruddemo.service;

import com.proiect.MVC.cruddemo.entity.Employee;

import java.util.List;
public interface EmployeeService {
    List<Employee> findAll();

    Employee findById(int theId);

    Employee save(Employee theEmployee);

    void deleteById(int theId);

}
