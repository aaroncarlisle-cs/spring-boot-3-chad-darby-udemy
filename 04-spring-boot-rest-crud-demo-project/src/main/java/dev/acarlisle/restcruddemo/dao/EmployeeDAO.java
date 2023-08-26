package dev.acarlisle.restcruddemo.dao;

import dev.acarlisle.restcruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();

}
