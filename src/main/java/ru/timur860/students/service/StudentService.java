package ru.timur860.students.service;

import ru.timur860.students.model.Student;

import java.util.List;

public interface StudentService {
    Student getById(Long id);

    void save(Student student);

    void delete(Long id);

    List<Student> getAll();
}
