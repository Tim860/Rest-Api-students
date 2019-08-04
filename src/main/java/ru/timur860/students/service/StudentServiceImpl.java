package ru.timur860.students.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.timur860.students.model.Student;
import ru.timur860.students.repository.StudentRepository;

import java.util.List;


@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentRepository StudentRepository;

    @Override
    public Student getById(Long id) {
        return StudentRepository.getOne(id);
    }

    @Override
    public void save(Student student) {
        StudentRepository.save(student);
    }

    @Override
    public void delete(Long id) {
        StudentRepository.deleteById(id);
    }

    @Override
    public List<Student> getAll() {
        return StudentRepository.findAll();
    }

}
