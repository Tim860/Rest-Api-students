package ru.timur860.students.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.timur860.students.model.Student;
import ru.timur860.students.repository.StudentRepository;

import java.util.List;

@Slf4j
@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    StudentRepository StudentRepository;

    @Override
    public Student getById(Long id) {
        log.info("IN StudentServiceImpl getById {}", id);
        return StudentRepository.getOne(id);
    }

    @Override
    public void save(Student student) {
        log.info("IN StudentServiceImpl save {}", student);
        StudentRepository.save(student);
    }

    @Override
    public void delete(Long id) {
        log.info("IN StudentServiceImpl delete {}", id);
        StudentRepository.deleteById(id);
    }

    @Override
    public List<Student> getAll() {
        log.info("IN StudentServiceImpl getAll");
        return StudentRepository.findAll();
    }

}
