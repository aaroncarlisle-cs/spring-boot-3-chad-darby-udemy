package dev.acarlisle.restcruddemo.service;


import dev.acarlisle.restcruddemo.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();
}
