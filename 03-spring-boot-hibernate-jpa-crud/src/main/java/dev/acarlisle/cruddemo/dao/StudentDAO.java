package dev.acarlisle.cruddemo.dao;

import dev.acarlisle.cruddemo.entity.Student;

import java.util.List;

public interface StudentDAO {

    void save(Student student);

    Student findById(Integer id);

    List<Student> findAll();
}
